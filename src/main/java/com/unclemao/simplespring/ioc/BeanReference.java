package com.unclemao.simplespring.ioc;

import lombok.Getter;
import lombok.Setter;

/**
 * 保存 bean 配置中 ref 属性对应的值，
 * 在后续 BeanFactory 实例化 bean 时，
 * 根据 BeanReference 保存的值去实例化 bean 所依赖的其他 bean
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 19:48
 */
@Getter
@Setter
public class BeanReference {

    private String name;

    private Object bean;

    public BeanReference(String name) {
        this.name = name;
    }
}
