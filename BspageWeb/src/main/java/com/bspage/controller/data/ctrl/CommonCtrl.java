package com.bspage.controller.data.ctrl;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bspage.controller.data.service.CommonService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Controller
@Data
@Slf4j
public class CommonCtrl {
	
	@Autowired
	CommonService commonService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String intro(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res) {
		log.info("### called root path method");
		log.info("### called service count=" + commonService.getTest());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		System.out.println("test: "+commonService.getTest());
		return "home";
	}
}
