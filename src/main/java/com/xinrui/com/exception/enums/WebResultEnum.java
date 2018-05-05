package com.xinrui.com.exception.enums;

/**
 * 
 * @ClassName: WebResultEnum
 * @Description:web层代码状态枚举
 * @author: liangzhicheng
 * @date: 2018年4月3日 上午11:48:00
 */
public enum WebResultEnum {

	PARAMS_ERROR(90000, "参数校验错误");

	/**
	 * 状态码
	 */
	private Integer code;

	/**
	 * 提示信息
	 */
	private String msg;

	WebResultEnum(Integer code, String msg) {
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
