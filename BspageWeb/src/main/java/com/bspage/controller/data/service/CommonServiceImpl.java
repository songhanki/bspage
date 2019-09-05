package com.bspage.controller.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bspage.controller.data.mappers.CommonMapper;

@Service
public class CommonServiceImpl implements CommonService{
	@Autowired
	CommonMapper mapper;
	
	@Override
	public int getTest() {
		return mapper.getTest();
	}
}
