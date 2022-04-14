package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {
	
	private static final String TAG = "HttpController Test";
	
	@GetMapping("http/get")
	public String getTest(Member m) {
		
		
		return "get 요청 : " + m.getId() + " -username:-"+ m.getUsername() ;
	}
	
	@PostMapping("http/post")
	public String postTest() {
		return "post 요청";
	}
	
	@PutMapping("http/put")
	public String putTest() {
		return "put 요청"; 
	}
	
	@DeleteMapping("http/delete")
	public String deleteTest() {
		return "delte 요청";
	}
	
	
}
