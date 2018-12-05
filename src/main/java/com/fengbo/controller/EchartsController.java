package com.fengbo.controller;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengbo.bean.NewStudent;
import com.fengbo.bean.SorceResult;
import com.fengbo.service.NewStudentService;

@Controller
public class EchartsController {

	@Resource
	private NewStudentService newstudentService;
	
	@RequestMapping("/getStudent")
	@ResponseBody
	public List<NewStudent> page(){
		List<NewStudent> allStudent = newstudentService.getAllStudent();
		System.out.println(allStudent.size());
		return allStudent;
	}
	
	@RequestMapping("/getData")
    @ResponseBody
    public List<SorceResult> getData(){
		List<NewStudent> allStudent = newstudentService.getAllStudent();
		List<SorceResult> results = new ArrayList<SorceResult>();
		for(NewStudent newStudent : allStudent) {
			SorceResult result = new SorceResult(newStudent.getScore(), newStudent.getName());
			results.add(result);
		}
		return results;
		
		
	}

	
	
}
