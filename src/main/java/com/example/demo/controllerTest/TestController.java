package com.example.demo.controllerTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/test")
@RestController
public class TestController {


	
	@GetMapping
	public String test1() {
		return "test";
		
	}
	
}
