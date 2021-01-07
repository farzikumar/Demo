package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "hi.jsp";

	}
}
