package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempComtroller {
	
	@GetMapping("temp/jsp")
	public String tempJsp() {
		return "test";
	}
	
	@GetMapping("temp/html")
	public String tempHtml() {
		return "/home.html";
	}
}
