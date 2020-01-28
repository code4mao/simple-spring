package com.unclemao.simplespring.simple;

import com.unclemao.simplespring.HelloService;
import com.unclemao.simplespring.HelloServiceImpl;

import org.junit.Test;

/**
 * SimpleAOP 测试类
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 15:23
 */
public class SimpleAOPTest {
    @Test
    public void getProxy() throws Exception {
        // 创建MethodInvocation实现类
        MethodInvocation logTask = () -> System.out.println("log task start");

        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
        System.out.println(helloServiceImpl);

        //创建一个Advice
        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);
        System.out.println(beforeAdvice);

        // 为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(helloServiceImpl, beforeAdvice);
        System.out.println(helloServiceImplProxy);

        helloServiceImplProxy.sayHalloWorld();
    }
}