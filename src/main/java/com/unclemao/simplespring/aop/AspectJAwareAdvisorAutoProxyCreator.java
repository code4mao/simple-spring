package com.unclemao.simplespring.aop;

import com.unclemao.simplespring.ioc.BeanPostProcessor;
import com.unclemao.simplespring.ioc.factory.BeanFactory;
import com.unclemao.simplespring.ioc.factory.BeanFactoryAware;
import com.unclemao.simplespring.ioc.xml.XmlBeanFactory;

import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * 整合 ioc 及 aop
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-29 19:42
 */
public class AspectJAwareAdvisorAutoProxyCreator implements BeanPostProcessor, BeanFactoryAware {

    private XmlBeanFactory xmlBeanFactory;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        /* 这里两个 if 判断很有必要，
         * 如果删除将会使程序进入死循环状态，
         * 最终导致 StackOverflowError 错误发生
         */
        if (bean instanceof AspectJExpressionPointcutAdvisor) {
            return bean;
        }
        if (bean instanceof MethodInterceptor) {
            return bean;
        }

        // 1.  从 BeanFactory 查找 AspectJExpressionPointcutAdvisor 类型的对象
        List<AspectJExpressionPointcutAdvisor> advisors = xmlBeanFactory
            .getBeansForType(AspectJExpressionPointcutAdvisor.class);
        for (AspectJExpressionPointcutAdvisor advisor : advisors) {

            // 2. 使用 Pointcut 对象匹配当前 bean 对象
            if (advisor.getPointcut().getClassFilter().matchers(bean.getClass())) {
                ProxyFactory advisedSupport = new ProxyFactory();
                advisedSupport.setMethodInterceptor((MethodInterceptor) advisor.getAdvice());
                advisedSupport.setMethodMatcher(advisor.getPointcut().getMethodMatcher());

                TargetSource targetSource = new TargetSource(bean.getClass(), bean.getClass().getInterfaces(), bean);
                advisedSupport.setTargetSource(targetSource);

                // 3. 生成代理对象，并返回
                return advisedSupport.getProxy();
            }
        }

        // 2. 匹配失败，返回 bean
        return bean;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws Exception {
        xmlBeanFactory = (XmlBeanFactory) beanFactory;
    }
}
