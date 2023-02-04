package com.my.spring.test.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void user(){
		System.out.println("插入user数据");
		jdbcTemplate.update("insert into user (name, age) values (?, ?)","jack1", 12);
		System.out.println(0);
		jdbcTemplate.update("insert into user (name, age) values (?, ?)","jack2", 12);
	}
}
