package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	// 연결 예시: http://localhost:57253/citest/getdata
	@GetMapping("getdata")
	public String get() {
		return "FISA DATA!";
	}
}
