package com.bspage.controller.data.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bspage.controller.data.mappers.BoardMapper;
import com.bspage.controller.data.mappers.PersonMapper;
import com.bspage.controller.data.vo.BoardVO;
import com.bspage.controller.data.vo.PersonVO;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonMapper mapper;
	
	@Override
	public int personCount() {
		return mapper.personCount();
	}
	
	public List<PersonVO> personFullList() {
		return mapper.personFullList();
	}
	
	public List<PersonVO> personSelectOne(String seq) {
		return mapper.personSelectOne(seq);
	}
	
	//CRUD(Create Read Update Delete)
	//게시글 생성
	public String personInsert(PersonVO board) {
		//return mapper.personInsert(board);
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("p_id", board.getP_id());
		map.put("p_pw", board.getP_pw());
		map.put("p_nm", board.getP_nm());
		
		mapper.personInsert(map);
		return "success";
	}
	
	//게시글 수정
	public void personUpdate(PersonVO board) {
		
	}
	
	//게시글 삭제
	public void personDelete(int b_no) {
		
	}
	
	//게시글 보기
	public PersonVO personDetail(int b_no) {
		return mapper.personDetail(b_no);
	}

}
