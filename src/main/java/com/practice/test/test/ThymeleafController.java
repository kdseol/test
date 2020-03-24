package com.practice.test.test;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/ex04")
	public String Thymeleaf04() {
		return "thymeleaf/ex04";
	}

	@RequestMapping("/ex05")
	public String Thymeleaf05(Model model) {
		model.addAttribute("msg", "ex05..");
		DataObject data = new DataObject(123,"star");
		model.addAttribute("object", data);
		return "thymeleaf/ex05";
	}
	
	class DataObject {
		public int id;
		public String name;
		
		public DataObject(int id, String name) {
			super();
			this.id=id;
			this.name=name;
		}
	}

	@RequestMapping("/ex06")
	public String Thymeleaf06(Model model) {
		model.addAttribute("msg", "ex06..");
		DataObject data = new DataObject(123,"star");
		model.addAttribute("object", data);
		return "thymeleaf/ex06";
	}

	@RequestMapping("/ex07")
	public String Thymeleaf07(Model model) {
		model.addAttribute("msg", "<h1>END</h1><br /><h2>END</h2>");
		return "thymeleaf/ex07";
	}
	
	@RequestMapping("/{num}")
	public ModelAndView index(@PathVariable int num, ModelAndView mav) {
		mav.setViewName("thymeleaf/index");
		
		mav.addObject("num", num);
		mav.addObject("check", num % 2 == 0);
		mav.addObject("trueVal", "Even number.");
		mav.addObject("falseVal", "Odd number.");

		ArrayList<String[]> list = new ArrayList<String[]>();
		list.add(new String[] {"kim", "kim@a.com"});
		list.add(new String[] {"lee", "lee@b.com"});
		mav.addObject("list", list);
		return mav;
	}
}
