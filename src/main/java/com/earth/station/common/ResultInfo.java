package com.earth.station.common;

/**
 * 统一返回类
 * 
 * @author Zongqian
 */
public class ResultInfo<T> {

	private int code; // 0操作成功
	private T data; // 返回的数据,正确的信息或错误描述信息


	public ResultInfo(){
		
	}
	public ResultInfo(T data){
		this.data = data;
	}
	public ResultInfo(int code, T data){
		this.code = code;
		this.data = data;
	}
	
	
	public int getCode() {
		return code;
	}

	public ResultInfo<T> setCode(int code) {
		this.code = code;
		return this;
	}

	public T getData() {
		return data;
	}

	public ResultInfo<T> setData(T data) {
		this.data = data;
		return this;
	}

}
