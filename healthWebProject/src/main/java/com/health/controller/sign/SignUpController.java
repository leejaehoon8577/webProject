package com.health.controller.sign;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/signUp/")
public class SignUpController {
		
		String name = null;
		String age = null;
		String weight = null;
		
//		회원가입 페이지
		@RequestMapping("signUp")
//		@ResponseBody
		public String signUp() {
			System.out.println("signUp Controller");
			
			return "signUp/signUp";
		}
		
		@RequestMapping("signUpResult")
//		@ResponseBody
		public String signUpResult(String name, String age, String weight) {
			System.out.println("signUpResult Controller");
			
			
			this.name = name;
			this.age = age;
			this.weight = weight;
			
			System.out.println("name = " + this.name);
			System.out.println("age = " + this.age);
			System.out.println("weight = " + this.weight);
			return "signUp/signUpResult";
		}
}
