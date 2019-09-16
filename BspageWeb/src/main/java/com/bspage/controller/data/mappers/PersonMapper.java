package com.bspage.controller.data.mappers;

import java.util.List;

import com.bspage.controller.data.vo.BoardVO;
import com.bspage.controller.data.vo.PersonVO;

public interface PersonMapper {
	public int personCount();
	public List<PersonVO> personFullList();
	public void personInsert(PersonVO board);
	public void personUpdate(PersonVO board);
	public void personDelete(int b_no);
	public PersonVO personDetail(int b_no);
}
