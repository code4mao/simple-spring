package com.unclemao.simplespring.ioc.factory;

/**
 * 1、BeanFactory 加载 Bean 配置文件，将读到的 Bean 配置封装成 BeanDefinition 对象
 * 2、将封装好的 BeanDefinition 对象注册到 BeanDefinition 容器中
 * 3、注册 BeanPostProcessor 相关实现类到 BeanPostProcessor 容器中
 * 4、BeanFactory 进入就绪状态
 * 5、外部调用 BeanFactory 的 getBean(String name) 方法，BeanFactory 着手实例化相应的 bean
 * 6、重复步骤 3 和 4，直至程序退出，BeanFactory 被销毁
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 19:55
 */
public interface BeanFactory {
    Object getBean(String beanName) throws Exception;
}
