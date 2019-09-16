package com.bspage.controller.data.mappers;

import java.util.List;

import com.bspage.controller.data.vo.BoardVO;

public interface BoardMapper {
	public int boardCount();
	public List<BoardVO> boardFullList();
	public void boardInsert(BoardVO board);
	public void boardUpdate(BoardVO board);
	public void boardDelete(int b_no);
	public BoardVO boardDetail(int b_no);
}
