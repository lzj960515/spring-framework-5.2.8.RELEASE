package com.my.spring.test.autowrid;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

/**
 * @author Zijian Liao
 * @since
 */
//@Primary
@Priority(value = 1)
@Component
public class DependClass implements Depend{
}
