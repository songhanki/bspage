package com.bspage.controller.data.service;

import java.util.List;

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
	
	//CRUD(Create Read Update Delete)
	//게시글 생성
	public void personInsert(PersonVO board) {
		//return mapper.boardInsert(board);
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
