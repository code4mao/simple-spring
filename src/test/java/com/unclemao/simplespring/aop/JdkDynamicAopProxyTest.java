package com.unclemao.simplespring.aop;

import com.unclemao.simplespring.HelloService;
import com.unclemao.simplespring.HelloServiceImpl;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * aop测试
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-29 16:40
 */
public class JdkDynamicAopProxyTest {
    @Test
    public void getProxy() throws Exception {
        System.out.println("---------- no proxy ----------");
        HelloService helloService = new HelloServiceImpl();
        System.out.println(helloService.getClass().getCanonicalName());
        helloService.sayHelloWorld();

        System.out.println("\n----------- proxy -----------");
        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setMethodInterceptor(new LogInterceptor());

        TargetSource targetSource = new TargetSource(HelloServiceImpl.class, HelloServiceImpl.class.getInterfaces(),
            helloService);
        advisedSupport.setTargetSource(targetSource);
        advisedSupport.setMethodMatcher((Method method, Class beanClass) -> true);

        helloService = (HelloService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        System.out.println(helloService.getClass().getCanonicalName());
        helloService.sayHelloWorld();
    }
}
