package com.unclemao.simplespring.aop;

/**
 * 返回类型过滤器和方法匹配器
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 20:56
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
