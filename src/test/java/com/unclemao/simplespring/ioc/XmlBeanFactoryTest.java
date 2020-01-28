package com.unclemao.simplespring.ioc;

import com.alibaba.fastjson.JSONObject;
import com.unclemao.simplespring.Car;
import com.unclemao.simplespring.HelloService;
import com.unclemao.simplespring.Wheel;
import com.unclemao.simplespring.ioc.xml.XmlBeanFactory;

import org.junit.Test;

/**
 * spring ioc 测试类
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 20:35
 */
public class XmlBeanFactoryTest {
    @Test
    public void getBean() throws Exception {
        System.out.println("--------- IOC test ----------");
        String location = getClass().getClassLoader().getResource("spring-ioc.xml").getFile();
        XmlBeanFactory bf = new XmlBeanFactory(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel + ":" + JSONObject.toJSONString(wheel));
        Car car = (Car) bf.getBean("car");
        System.out.println(car + "[" + car.getWheel() + "]:" + JSONObject.toJSONString(car));

        HelloService helloService = (HelloService) bf.getBean("helloService");
        helloService.sayHelloWorld();
    }
}
