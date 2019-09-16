package com.bspage.controller.data.vo;

import java.util.Date;

import lombok.Data;

@Data
public class PersonVO {
	private int p_seq;
	private String p_id;
	private String p_pw;
	private String p_nm;
	private String p_type;
	private Date create_date;
	private Date mod_date;
	private String creator_id;
	private String mod_id;
	
}
