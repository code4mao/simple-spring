package com.unclemao.simplespring.aop;

import org.aopalliance.aop.Advice;

/**
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-29 16:29
 */
public interface Advisor {
    Advice getAdvice();
}
