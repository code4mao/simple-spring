package com.unclemao.simplespring;

import lombok.Getter;
import lombok.Setter;

/**
 * IOC 测试使用的 bean
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 14:10
 */
@Getter
@Setter
public class Car {
    private String name;
    private String length;
    private String width;
    private String height;
    private Wheel wheel;
}
