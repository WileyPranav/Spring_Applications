package com.eif.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@RequestMapping("/hi")
	public String hi() {
		return "Good Afternoon User";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello User!! How are you?";
	}
}
