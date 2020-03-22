package com.pluralsight.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("greeting")
	public String greeting(Map<String,Object> map) {
		map.put("message", "Hello Zaaakiii9");
		return "greeting";
	}

}
