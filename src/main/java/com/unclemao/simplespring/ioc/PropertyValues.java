package com.unclemao.simplespring.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-28 19:41
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        // 在这里可以对参数值 pv 做一些处理，如果直接使用 List，则就不行了
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValueList() {
        return this.propertyValueList;
    }
}
