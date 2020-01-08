package com.bspage.controller.data.mappers;

import java.util.List;
import java.util.Map;

import com.bspage.controller.data.vo.CategoryVO;

public interface CategoryMapper {
	public List<CategoryVO> ctgrList();
	
	public List<CategoryVO> ctgrDetail(String ctgr_cd);
	
	public int createUpperCtgr(CategoryVO vo);
	
	public int createLowerCtgr(Map<String, Object> map);
}
