package com.spring.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordlController {

	//controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	//need controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
}
