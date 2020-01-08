package com.bspage.controller.data.ctrl;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bspage.controller.data.service.CategoryService;
import com.bspage.controller.data.vo.CategoryVO;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Controller
@Data
@Slf4j
public class CategoryCtrl {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/ctgrMain", method = RequestMethod.GET)
	public String ctgrMain(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res) {
		List<CategoryVO> ctgr_list = categoryService.ctgrList();
		
		model.addAttribute("list", ctgr_list);
		return "category/ctgr_main";
	}

	@RequestMapping(value = "/ctgrDetail", method = RequestMethod.POST)
	public String ctgrdetail(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res
			, @RequestParam String ctgr_cd) {	
		
		List<CategoryVO> ctgr_detail = categoryService.ctgrDetail(ctgr_cd);
		model.addAttribute("list", ctgr_detail);
		return "category/ctgr_detail";
	}
}
