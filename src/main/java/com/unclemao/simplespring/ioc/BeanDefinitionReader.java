package com.unclemao.simplespring.ioc;

import java.io.FileNotFoundException;

/**
 * 加载和解析配置文件
 *
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 19:36
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws FileNotFoundException, Exception;
}
