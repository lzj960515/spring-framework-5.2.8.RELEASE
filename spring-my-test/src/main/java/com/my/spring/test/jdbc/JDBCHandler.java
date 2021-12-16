package com.my.spring.test.jdbc;

/**
 * jdbc handler
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@FunctionalInterface
public interface JDBCHandler<V> {

	V apply();
}
