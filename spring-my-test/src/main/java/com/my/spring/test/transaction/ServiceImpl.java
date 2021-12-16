package com.my.spring.test.transaction;

import com.my.spring.test.jdbc.JDBCUtil;
import com.my.spring.test.jdbc.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * service 实现类
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Service
public class ServiceImpl implements IService{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private UserService userService;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void test(){
		System.out.println("插入数据");
		jdbcTemplate.update("insert into user (name, age) values (?, ?)","jack1", 12);
		userService.user();
//		System.out.println(1/0);
		jdbcTemplate.update("insert into user (name, age) values (?, ?)","jack2", 12);
	}
}
