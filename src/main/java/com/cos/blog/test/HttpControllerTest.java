package com.cos.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.repository.BoardRepository;
import com.cos.blog.repository.UserRepository;

@RestController
public class HttpControllerTest {
	
	private final static String TAG = "HttpControllerTest:";
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BoardRepository boardRepository;
	
	@GetMapping("/getAllUser")
	public String userTest() {
		
		return userRepository.selectAllUser().toString();
	}
	
	@GetMapping("/getUser")
	public String userTest2() {
		
		return userRepository.selectUser(1).toString();
	}
	
	
	
	@GetMapping("/baordTest")
	public String baartTest() {

		return boardRepository.selectAllBoard().toString();
	}
	
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = Member.builder().password("1234").email("test@gmail.com").build();

		System.out.println(TAG + "lombok:" + m.getId());
		System.out.println(TAG + "email:" + m.getEmail());
		
		m.setId(5000);
		m.setEmail("hyeon@gmail.com");
		
		System.out.println(TAG + "lombok:" + m.getId());
		System.out.println(TAG + "email:" + m.getEmail());
		
		
		return "lombok Test 완료";
	}
	
	@GetMapping("/http/get")
	public String getTest(Member m) {
		System.out.println(TAG + "getter:" + m.getId());
		System.out.println(TAG + "getter:" + m.getPassword());
		System.out.println(TAG + "getter:" + m.getEmail());
		
		return "get 요청:" + m.getId() + ":" + m.getPassword()  + ":" + m.getEmail() ;
	}
	
	@PostMapping("/http/post")
	public String postTest(@RequestBody String text) {
		return "post 요청:" + text;
	}
	
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
