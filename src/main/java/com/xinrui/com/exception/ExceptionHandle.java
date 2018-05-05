package com.xinrui.com.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinrui.com.bean.WebResult;
import com.xinrui.com.exception.enums.BaseResultEnum;

/**
 * 
 * @ClassName: ExceptionHandle
 * @Description:全局异常拦截,对错误进行拦截,做统一处理
 * @author: liangzhicheng
 * @date: 2018年4月3日 上午11:05:10
 */
@ControllerAdvice
public class ExceptionHandle {

	public final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public WebResult handle(Exception e) {
		if (e instanceof Exception) {
			// 已知异常,不打印堆栈信息
			Exception exception = (Exception) e;
			return new WebResult(exception.getCode(), exception.getMessage());
		} else {
			// 未知异常,需要打印
			logger.error("【系统异常】{}", e);
			return new WebResult(BaseResultEnum.SERVER_UNKNOW_ERROR.getCode(), BaseResultEnum.SERVER_UNKNOW_ERROR.getMsg());
		}

	}

}
