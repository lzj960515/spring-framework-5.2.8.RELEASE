package com.my.spring.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.function.Function;

/**
 * jdbc工具
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class JDBCUtil {

	private static final ThreadLocal<Connection> THREAD_LOCAL = new ThreadLocal<>();

	/**
	 * 具备事务能力的方法
	 */
	public static <V> V execFunc(Function<Connection, V> task) {
		Connection connection = JDBCPool.get();
		THREAD_LOCAL.set(connection);
		V v = null;
		try {
			connection.setAutoCommit(false);
			v = task.apply(null);
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} finally {
			if (connection != null) {
				JDBCPool.close(connection);
				THREAD_LOCAL.remove();
			}
		}
		return v;
	}

	/**
	 * 自动提交的方法
	 */
	public static <V> V execute(JDBCHandler<V> task) {
		Connection connection = JDBCPool.get();
		THREAD_LOCAL.set(connection);
		V v = null;
		try {
			v = task.apply();
		} finally {
			if (connection != null) {
				JDBCPool.close(connection);
				THREAD_LOCAL.remove();
			}
		}
		return v;
	}


	public static int insert(User u) {
		Connection connection = THREAD_LOCAL.get();
		try {
			String sql = "insert into user (name, age) values (?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, u.getName());
			ps.setInt(2, u.getAge());
			return ps.executeUpdate();
		} catch (SQLException throwable) {
			throwable.printStackTrace();
		}
		return 0;
	}
}
