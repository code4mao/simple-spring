package com.unclemao.simplespring.ioc.factory;

/**
 * 通过实现 Aware 接口，可以在运行时获取一些配置信息
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 19:55
 */
public interface BeanFactoryAware {
    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
