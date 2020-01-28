package com.unclemao.simplespring.simple;

import com.alibaba.fastjson.JSONObject;
import com.unclemao.simplespring.Car;
import com.unclemao.simplespring.Wheel;

import org.junit.Test;

/**
 * IOC 的测试类
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 14:12
 */
public class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("simple-ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel + ":" + JSONObject.toJSONString(wheel));
        Car car = (Car) bf.getBean("car");
        System.out.println(car + "[" + car.getWheel() + "]:" + JSONObject.toJSONString(car));
    }
}