package com.practice.test.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

	@RequestMapping("/ex02")
	public String Thymeleaf() {
		return "thymeleaf/ex02";
	}

	@RequestMapping("/ex03")
	public String Thymeleaf03() {
		return "thymeleaf/ex03";
	}
}
