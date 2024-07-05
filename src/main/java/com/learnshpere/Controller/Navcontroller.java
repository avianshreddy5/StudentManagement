package com.learnshpere.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Navcontroller {

	@GetMapping("/")
	public String indexpage() {
		return "/index";
	}

	@GetMapping("/addstudent")
	public String addstudent() {
		return "student";
	}

}
