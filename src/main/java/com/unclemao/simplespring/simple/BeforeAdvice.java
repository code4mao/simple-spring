package com.unclemao.simplespring.simple;

import java.lang.reflect.Method;

/**
 * 实现了 Advice 接口，是一个前置通知
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 15:13
 */
public class BeforeAdvice implements Advice {
    private Object bean;
    private MethodInvocation methodInvocation;

    public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        methodInvocation.invoke();
        return method.invoke(bean, args);
    }
}
