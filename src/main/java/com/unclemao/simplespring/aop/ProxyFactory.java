package com.unclemao.simplespring.aop;

/**
 * TODO
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-29 16:37
 */
public class ProxyFactory extends AdvisedSupport implements AopProxy {

    @Override
    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        return new JdkDynamicAopProxy(this);
    }
}
