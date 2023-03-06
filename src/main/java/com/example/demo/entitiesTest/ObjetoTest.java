package com.example.demo.entitiesTest;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor

public class ObjetoTest {

	String dato1;
	String dato2;
	
	public ObjetoTest(String dato1, String dato2) {
		this.dato1 = dato1;
		this.dato2 = dato2;
	}
	
	
}
