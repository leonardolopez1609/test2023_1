package com.example.demo.controllerTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitiesTest.ObjetoTest;

@RequestMapping("api/test")
@RestController
public class TestController {

ObjetoTest ob= new ObjetoTest("a", "b");
ObjetoTest ob2= ObjetoTest.builder().dato1("c").dato2("d").build();
ObjetoTest ob3= new ObjetoTest();
	
	@GetMapping
	public String test1() {
		return ob2.getDato1();
	
		
	}
	
}
