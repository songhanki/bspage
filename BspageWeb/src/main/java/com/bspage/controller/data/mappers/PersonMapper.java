package com.bspage.controller.data.mappers;

import java.util.List;
import java.util.Map;

import com.bspage.controller.data.vo.BoardVO;
import com.bspage.controller.data.vo.PersonVO;

public interface PersonMapper {
	public int personCount();
	public List<PersonVO> personFullList();
	public List<PersonVO> personSelectOne(String seq);
	public int personInsert(Map<String, Object> map);
	public void personUpdate(PersonVO board);
	public void personDelete(int b_no);
	public PersonVO personDetail(int b_no);
}
