package com.my.spring.test.transaction;

import com.my.spring.test.jdbc.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 事务
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Configuration
@ComponentScan
@EnableTransactionManagement
public class TranMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TranMain.class);
		IService service = context.getBean(IService.class);
		service.test();
	}
}
