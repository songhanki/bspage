package com.bspage.controller.data.service;

import java.util.List;
import java.util.Map;

import org.apache.xmlbeans.impl.regex.REUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bspage.controller.data.mappers.CategoryMapper;
import com.bspage.controller.data.vo.CategoryVO;
import com.bspage.controller.data.vo.PersonVO;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryMapper mapper;
	
	@Override
	public List<CategoryVO> ctgrList(){
		return mapper.ctgrList();
	}
	
	public List<CategoryVO> ctgrDetail(String ctgr_cd){
		return mapper.ctgrDetail(ctgr_cd);
	}
	
	public int createUpperCtgr(CategoryVO vo) {
		return mapper.createUpperCtgr(vo);
	}
	
	//public int createLowerCtgr(Map<String, Object> map);
	
}
