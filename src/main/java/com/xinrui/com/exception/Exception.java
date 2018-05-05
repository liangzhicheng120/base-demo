package com.xinrui.com.exception;

import com.xinrui.com.exception.enums.BaseResultEnum;
import com.xinrui.com.exception.enums.WebResultEnum;

/**
 * 
 * @ClassName: Exception
 * @Description:自定义全局异常处理类
 * @author: liangzhicheng
 * @date: 2018年4月3日 上午11:02:30
 */
public class Exception extends RuntimeException {

	/**
	 * 序列化标识
	 */
	private static final long serialVersionUID = 6269187198225501894L;

	/**
	 * 状态码
	 */
	private Integer code;

	// 自定义异常信息
	public Exception(Integer code, String msg) {
		super(msg);
		this.code = code;
	}

	// 基础异常信息
	public Exception(BaseResultEnum baseResultEnum) {
		super(baseResultEnum.getMsg());
		this.code = baseResultEnum.getCode();
	}

	// web层代码异常信息
	public Exception(WebResultEnum webResultEnum) {
		super(webResultEnum.getMsg());
		this.code = webResultEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
