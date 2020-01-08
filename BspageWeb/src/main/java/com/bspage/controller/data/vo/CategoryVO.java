package com.bspage.controller.data.vo;

import lombok.Data;

@Data
public class CategoryVO {
	private int ctgr_no; // 쌓이는 순서
	private String ctgr_name; // 카테고리 이름
	private int ctgr_lvl; // 카테고리 레벨
	private String ctgr_cd; // 카테고리 코드
	private String ctgr_upper_cd; // 상위 카테고리 코드
	private int ctgr_seq; // 카테고리 순서
}
