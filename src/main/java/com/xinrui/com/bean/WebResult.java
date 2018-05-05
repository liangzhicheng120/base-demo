package com.xinrui.com.bean;

/**
 * @ClassName: WebResult
 * @Description:统一异常处理类
 * @author: liangzhicheng
 * @date: 2018年4月3日 上午10:30:40
 */
public class WebResult {
	/**
	 * 状态码
	 */
	private Integer code = 200;
	/**
	 * 提示信息
	 */
	private String msg = Boolean.TRUE.toString();
	/**
	 * 返回值
	 */
	private Object value;
	/**
	 * 重定向地址
	 */
	private String redirect = "";

	public WebResult(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public WebResult(Object object) {
		this.value = object;
	}

	public WebResult() {
		this(null);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

}
