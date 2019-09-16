package com.bspage.controller.data.service;

import java.util.List;

import com.bspage.controller.data.vo.BoardVO;

public interface BoardService {
	//게시글 전체갯수
	public int boardCount();
	
	//게시글 전체 리스트
	public List<BoardVO> boardFullList();
	
	//CRUD(Create Read Update Delete)
	//게시글 생성
	public void boardInsert(BoardVO board);
	
	//게시글 수정
	public void boardUpdate(BoardVO board);
	
	//게시글 삭제
	public void boardDelete(int b_no);
	
	//게시글 보기
	public BoardVO boardDetail(int b_no);

}
