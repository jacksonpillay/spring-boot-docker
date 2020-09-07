package com.test.launch.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaunchController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/welcome")
	public ResponseEntity<String> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		final String temp = new String ("Hello from --> "+name);
		//return new Greeting(counter.incrementAndGet(), String.format(template, name));
	return new ResponseEntity<String>(temp,HttpStatus.OK);
	}

}
