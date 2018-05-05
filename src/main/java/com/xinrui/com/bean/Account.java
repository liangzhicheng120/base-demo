package com.xinrui.com.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Account {

	private Integer id;

	@NotEmpty(message = "名称不能为空")
	private String name;

	@NotNull(message = "转账金额不能为空")
	@Min(value = 20, message = "转账金额不能低于20元")
	private Double money;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

}
