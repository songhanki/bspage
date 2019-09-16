package com.bspage.controller.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bspage.controller.data.mappers.BoardMapper;
import com.bspage.controller.data.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardMapper mapper;
	
	@Override
	public int boardCount() {
		return mapper.boardCount();
	}
	
	public List<BoardVO> boardFullList() {
		return mapper.boardFullList();
	}
	
	//CRUD(Create Read Update Delete)
	//게시글 생성
	public void boardInsert(BoardVO board) {
		//return mapper.boardInsert(board);
	}
	
	//게시글 수정
	public void boardUpdate(BoardVO board) {
		
	}
	
	//게시글 삭제
	public void boardDelete(int b_no) {
		
	}
	
	//게시글 보기
	public BoardVO boardDetail(int b_no) {
		return mapper.boardDetail(b_no);
	}

}
