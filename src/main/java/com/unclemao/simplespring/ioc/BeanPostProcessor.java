package com.unclemao.simplespring.ioc;

/**
 *  Spring 对外拓展的接口之一，其主要用途提供一个机会，让开发人员能够插手 bean 的实例化过程。
 *  通过实现这个接口，我们就可在 bean 实例化时，对bean 进行一些处理。
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 19:57
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;
}
