package com.bspage.controller.data.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int b_no;
	private String title;
	private String creator_id;
	private String b_comment;
	private Date create_date;
	
}
