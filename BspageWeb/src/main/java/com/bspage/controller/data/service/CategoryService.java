package com.bspage.controller.data.service;

import java.util.List;
import java.util.Map;

import com.bspage.controller.data.vo.CategoryVO;
import com.bspage.controller.data.vo.PersonVO;

public interface CategoryService {
	//카테고리 전체 리스트
	public List<CategoryVO> ctgrList();
	
	//카테고리 상세
	public List<CategoryVO> ctgrDetail(String ctgr_cd);
	
	//대 카테고리 생성
	public int createUpperCtgr(CategoryVO vo);
	
	//중,소 카테고리 생성
	//public int createLowerCtgr(Map<String, Object> map);
	
	//카테고리 상세 수정
	
}
