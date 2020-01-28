package com.unclemao.simplespring.simple;

import java.lang.reflect.Proxy;

/**
 * 生成代理类
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 15:09
 */
public class SimpleAOP {
    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}
