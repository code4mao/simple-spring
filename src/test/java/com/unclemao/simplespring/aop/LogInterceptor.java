package com.unclemao.simplespring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-29 16:39
 */
public class LogInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(invocation.getMethod().getName() + " method start");
        Object obj = invocation.proceed();
        System.out.println(invocation.getMethod().getName() + " method end");
        return obj;
    }
}
