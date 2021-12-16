package com.my.spring.test.jdbc;

import java.sql.SQLException;

/**
 * @author Zijian Liao
 * @since
 */
public class Main {

	public static void main(String[] args) {
		Integer execute = JDBCUtil.execFunc((connection) -> {
			JDBCUtil.insert(new User("王五", 18));
			JDBCUtil.insert(new User("赵六", 18));
			try {
				connection.commit();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
			return 1;
		});
		System.out.println(execute);
	}
}
