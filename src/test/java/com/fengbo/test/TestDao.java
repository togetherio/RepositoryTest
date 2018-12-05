package com.fengbo.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fengbo.bean.Mobile;
import com.fengbo.mapper.MobileMapper;

public class TestDao {

	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
		MobileMapper mobileMapper = context.getBean(MobileMapper.class);
		Mobile mobile = mobileMapper.getInfo("1886663");
		String mobilearea = mobile.getMobilearea();
		System.out.println(mobilearea);
	}
}
