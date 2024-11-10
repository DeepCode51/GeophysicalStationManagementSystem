package com.earth.station.common;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Map;

import org.springframework.beans.BeanUtils;

public class StringUtil {

	public static String format(Object object) {
		if (object == null) {
			return "";
		}
		return ((String) object).trim();
	}
	public static String format(Object object, String defaultValue) {
		if (object == null) {
			return defaultValue;
		}
		String val = object.toString().trim();
		if(val.equals(""))
			return defaultValue;
		return val;
	}

	/**
	 * 为字符串类型设置默认值
	 */
	public static void setDefaultValue(Object obj) {
		try {
			PropertyDescriptor[] propertys = BeanUtils.getPropertyDescriptors(obj.getClass());
			for (PropertyDescriptor pro : propertys) {
				if (pro.getPropertyType() != String.class) {
					continue;
				}
				Method readMethod = pro.getReadMethod();
				Object value = null;
				value = readMethod.invoke(obj);
				if (value != null)
					continue;
				Method writeMethod = pro.getWriteMethod();
				writeMethod.invoke(obj, "");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * StringBuffer字符串占位符替换
	 */
	public static void replaceAll(StringBuffer sb, Map<String, String> map){
		for (Map.Entry<String, String> entry : map.entrySet()) {  
			String key = "${" + entry.getKey() + "}";
			int index = -1;
			while((index = sb.indexOf(key)) != -1){
				String value = StringUtil.format(entry.getValue());
				sb.replace(index, index + key.length(), value);
			}
		}
	}
	/**
	 * 连接字符串数组
	 */
	public static String join(String separator, Object... array){
		return join(separator, "", array);
	}
	/**
	 * 连接字符串数组
	 */
	public static String join(String separator, String defaultValue, Object... array){
		if (separator == null) {
		    separator = "";
		}
		StringBuffer buf = new StringBuffer();
	    for (Object item : array){
	    	if(item == null)
	    		continue;
	    	String s = String.valueOf(item).trim();
	    	if(s.equals(""))
	    		continue;
	        if (buf.length() > 0) {
	            buf.append(separator);
	        }
	        buf.append(s);
	    }
	    if(buf.length() == 0)
	    	return defaultValue;
	    return buf.toString();
	}
}
