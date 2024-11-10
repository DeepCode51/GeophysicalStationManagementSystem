package com.earth.station.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class CustomPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer{
	private static Map<String,String> propertyMap;

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
			throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		propertyMap = new HashMap<String, String>();
        for (Object item : props.keySet()) {
            String key = item.toString();
            String value = props.getProperty(key);
            propertyMap.put(key, value);
        }
	}
	public static String getProperty(String name) {
        return propertyMap.get(name);
    }
    
}
