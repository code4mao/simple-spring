package com.unclemao.simplespring.aop;

import com.unclemao.simplespring.HelloService;
import com.unclemao.simplespring.ioc.xml.XmlBeanFactory;

import org.junit.Test;

/**
 * SpringAOP 测试类
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-29 20:06
 */
public class SpringIOCAndAOP {
    @Test
    public void getProxy() throws Exception {
        System.out.println("--------- IOC test ----------");
        String location = getClass().getClassLoader().getResource("spring-ioc.xml").getFile();
        XmlBeanFactory bf = new XmlBeanFactory(location);
        HelloService helloService = (HelloService) bf.getBean("helloService");
        System.out.println(helloService.getClass().getCanonicalName());
        helloService.sayHelloWorld();
    }
}
