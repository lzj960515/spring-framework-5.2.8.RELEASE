package com.my.spring.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * jdbc连接池
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class JDBCPool {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static final int CAPACITY = 10;
	/**
	 * 使用阻塞队列存储连接
	 */
	private static final BlockingQueue<Connection> pool = new ArrayBlockingQueue<>(CAPACITY);
	/**
	 * 当前连接数
	 */
	private static final AtomicInteger size =  new AtomicInteger();

	private static String url = "jdbc:mysql://localhost:3306/test?useSSL=false&characterEncoding=utf8";
	private static String user = "root";
	private static String password = "root";

	public static Connection get() {
		Connection conn = null;
		try {
			if (size.incrementAndGet() < CAPACITY) {
				conn = doGet();
				pool.put(conn);
			} else {
				conn = pool.take();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static Connection doGet() {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException throwable) {
			throwable.printStackTrace();
			throw new RuntimeException(throwable.getCause());
		}
	}

	public static void close(Connection conn) {
		try {
			pool.put(conn);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
