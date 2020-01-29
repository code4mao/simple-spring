package com.unclemao.simplespring.aop;

/**
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 22:01
 */
public abstract class AbstractAopProxy implements AopProxy {
    public AdvisedSupport advised;

    public AbstractAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }
}
