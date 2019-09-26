package com.bspage.controller.data.ctrl;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bspage.controller.data.service.BoardService;
import com.bspage.controller.data.service.PersonService;
import com.bspage.controller.data.vo.PersonVO;

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
		//System.out.println("personService.personFullList() : "+personService.personFullList());
		
		model.addAttribute("list", personService.personFullList() );
		return "person/person_list";
	}
	
	@RequestMapping(value = "/person_create", method = RequestMethod.GET)
	public String personCreatePage(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res) {
		log.info("### called root path method");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		//model.addAttribute("list", personService.personFullList() );
		return "person/person_create";
	}
	
	@RequestMapping(value = "/person_mod", method = RequestMethod.GET)
	public String personModPage(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res
			, @RequestParam String seq) {
		log.info("### called root path method");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		List<PersonVO> list = personService.personSelectOne(seq) ;
		System.out.println("list : "+list);
		
		model.addAttribute("list", personService.personSelectOne(seq) );
		return "person/person_mod";
	}
	
	@RequestMapping(value = "/person_create/create", method = RequestMethod.POST)
	//public  Map<String, Object> personCreate(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res, PersonVO personVO
	public @ResponseBody String personCreate(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res, PersonVO personVO
			, @RequestParam Map<String, Object> param) {
		log.info("### called root path method");
		
		Date date = new Date();
		Map<String, Object> map = new HashMap<String, Object>();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		/*
		String formattedDate = dateFormat.format(date);
		System.out.println("personVO: "+personVO);
		String result = personService.personInsert(personVO);
		System.out.println("result: "+result);
		map.put("result", result);
		*/
		//model.addAttribute("result", personService.personInsert(personVO) );
		//return "redirect:/person_list";
		return personService.personInsert(personVO);
	}
}
