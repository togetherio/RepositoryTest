package com.fengbo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengbo.bean.Mobile;
import com.fengbo.service.MobileService;

@Controller
public class MobileController {

	@Resource
	private MobileService mobieservice;
	
	@RequestMapping("/getInfo")
	@ResponseBody
	public Mobile getInfo(String mobilenumber) {
		Mobile mobile = mobieservice.getInfo(mobilenumber);
		System.out.println(mobile);
		return mobile;
		
	}
	
}
