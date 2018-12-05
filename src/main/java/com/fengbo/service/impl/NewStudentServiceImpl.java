package com.fengbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fengbo.bean.NewStudent;
import com.fengbo.mapper.NewStudentMapper;
import com.fengbo.service.NewStudentService;

@Service
public class NewStudentServiceImpl implements NewStudentService {

	@Resource
    private NewStudentMapper newstudentMapper;

	
	@Override
	public List<NewStudent> getAllStudent() {
		return newstudentMapper.getAllStudent();
	}

}
