package com.unclemao.simplespring.aop;

/**
 * 类型过滤器
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 20:58
 */
public interface ClassFilter {

    Boolean matchers(Class beanClass) throws Exception;
}
