package com.unclemao.simplespring.ioc;

import lombok.Getter;

/**
 * 记录 bean 配置中的标签的属性值
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 19:41
 */
@Getter
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }
}
