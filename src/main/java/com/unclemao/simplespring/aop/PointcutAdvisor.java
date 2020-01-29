package com.unclemao.simplespring.aop;

/**
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-29 16:30
 */
public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
