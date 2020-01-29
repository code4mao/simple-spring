package com.unclemao.simplespring.aop;

import java.lang.reflect.Method;

/**
 * 方法匹配器
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 20:57
 */
public interface MethodMatcher {

    Boolean matchers(Method method, Class beanClass);
}
