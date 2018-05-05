package com.xinrui.com.web.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xinrui.com.bean.WebResult;

/**
 * 
 * @ClassName: TestController
 * @Description:测试控制类
 * @author liangzhicheng
 * @date 2018年4月23日 下午4:19:18
 *
 */
@RestController
public class TestController {

	@GetMapping("/")
	public WebResult index() {
		return new WebResult("Greetings from Spring Boot!");
	}

}
