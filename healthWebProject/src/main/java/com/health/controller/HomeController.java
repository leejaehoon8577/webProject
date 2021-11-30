package com.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 메인 페이지
@Controller
@RequestMapping("/")
public class HomeController{

	@RequestMapping("index")
//	@ResponseBody
	public String index() {
		System.out.println("index Controller");
		return "index";
	}
	

}
