package com.bspage.controller.data.service;

import java.util.List;

import com.bspage.controller.data.vo.BoardVO;
import com.bspage.controller.data.vo.PersonVO;

public interface PersonService {
	//게시글 전체갯수
	public int personCount();
	
	//게시글 전체 리스트
	public List<PersonVO> personFullList();
	
	//회원 1명 검색
	public List<PersonVO> personSelectOne(String seq);
	
	//CRUD(Create Read Update Delete)
	//게시글 생성
	public String personInsert(PersonVO board);
	
	//게시글 수정
	public void personUpdate(PersonVO board);
	
	//게시글 삭제
	public void personDelete(int b_no);
	
	//게시글 보기
	public PersonVO personDetail(int b_no);

}
