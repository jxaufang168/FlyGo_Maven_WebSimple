package com.flygo520.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flygo520.service.PicService;

@Controller
public class PicController {

	@Resource
	private PicService picService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", picService.selAll());
		return "/index.jsp";
	}
}
