package com.unclemao.simplespring;

/**
 * 目标对象
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 15:23
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHalloWorld() {
        System.out.println("Hello world!");
    }
}
