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

import com.bspage.controller.data.service.BoardService;
import com.bspage.controller.data.service.PersonService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Controller
@Data
@Slf4j
public class BoardCtrl {
	@Autowired
	BoardService boardService;
	
	@Autowired
	PersonService personService;
	

	@RequestMapping(value = "/board_list", method = RequestMethod.GET)
	public String boardList(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res) {
		log.info("### called root path method");
		log.info("### called service count=" + boardService.boardCount());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("list", boardService.boardFullList() );
		return "board/board_list";
	}
	
	@RequestMapping(value = "/person_list", method = RequestMethod.GET)
	public String personList(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res) {
		log.info("### called root path method");
		log.info("### called service count=" + personService.personCount());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("list", personService.personFullList() );
		return "person/person_list";
	}
	
	@RequestMapping(value = "/person_create", method = RequestMethod.GET)
	public String personCreate(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res) {
		log.info("### called root path method");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		//model.addAttribute("list", personService.personFullList() );
		return "person/person_create";
	}
}
