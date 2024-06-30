package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HelloController {

	//welcome page
	@GetMapping("/")
	public String displayHomePage() {
		return "index";
	}
}
