package com.my.spring.test.share.happy.many;

import org.springframework.stereotype.Service;

import javax.annotation.Priority;

/**
 * 用户服务实现类
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Priority(1)
@Service
public class UserService implements IService {
}
