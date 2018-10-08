package com.flygo520.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.flygo520.pojo.Pic;
import com.flygo520.service.PicService;

@Controller
public class PicController {

	@Resource
	private PicService picService;

	@RequestMapping("/insert")
	public String insert(MultipartFile file, HttpServletRequest req) {
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(),
					new File(req.getServletContext().getRealPath("files"), file.getOriginalFilename()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Pic pic = new Pic();
		pic.setPath(file.getOriginalFilename());
		int id = picService.insPic(pic);
		if (id > 0) {
			return "redirect:/getPicList";
		} else {
			return "/add.jsp";
		}
	}

	@RequestMapping("/getPicList")
	public String getPicList(Model model) {
		model.addAttribute("list", picService.selAll());
		return "/main.jsp";
	}

	@RequestMapping("/delete")
	public String delete(int id) {
		int result = picService.delById(id);
		return "redirect:/getPicList";
	}

}
