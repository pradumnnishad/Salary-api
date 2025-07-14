package com.coder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Salary {

	
	@GetMapping("/salary")
	public ResponseEntity<Integer> getsalary(){
		
		return new ResponseEntity<Integer>(50000,HttpStatus.OK);
	}
}
