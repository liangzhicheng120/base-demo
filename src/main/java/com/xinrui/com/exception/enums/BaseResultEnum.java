package com.xinrui.com.exception.enums;

/**
 * 
 * @ClassName: ResultEnum
 * @Description:基础结果状态枚举类
 * @author: liangzhicheng
 * @date: 2018年4月3日 上午11:29:22
 */
public enum BaseResultEnum {

	SERVER_UNKNOW_ERROR(100000, "服务端未知错误");

	/**
	 * 状态码
	 */
	private Integer code;

	/**
	 * 提示信息
	 */
	private String msg;

	BaseResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
