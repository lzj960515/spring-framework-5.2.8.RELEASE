package com.my.spring.test.transaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Configuration
@EnableTransactionManagement
public class TransactionConfiguration {

	private static String url = "jdbc:mysql://localhost:3306/test?useSSL=false&characterEncoding=utf8";
	private static String user = "root";
	private static String password = "root";

	@Bean
	public DataSource dataSource(){
		return new DriverManagerDataSource(url, user, password);
	}

	@Bean
	public JdbcTemplate jdbcTemplate(){
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public TransactionManager transactionManager(){
		return new DataSourceTransactionManager(dataSource());
	}
}
