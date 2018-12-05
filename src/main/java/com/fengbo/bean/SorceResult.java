package com.fengbo.bean;

import java.io.Serializable;

public class SorceResult implements Serializable {

	public int value;
	public String name;

	public SorceResult(Double double1, String name2) {
		// TODO 自动生成的构造函数存根
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
