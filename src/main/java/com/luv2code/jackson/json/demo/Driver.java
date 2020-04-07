package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
//			Student student1 = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);
//			System.out.println(student1);
			
			
			
			Student student2 = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println(student2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
