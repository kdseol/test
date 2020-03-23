package com.practice.test.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	//redirect, forward
	@RequestMapping("/index03")
	public String index(Model model) {
		return "index03";
	}
	
	@RequestMapping(value="index03/redi")
	public String other() {
		return "redirect:/index03";
	}
	
	@RequestMapping(value="index03/forw")
	public String home() {
		return "forward:/index03";
	}
	// 폼 사용해서 POST로 넘기기.
	
	@RequestMapping("/index02")
	public String index02(Model model) {
		model.addAttribute("msg", "input your id.");
		return "index02";
	}
	
	@RequestMapping(value="/index02", method=RequestMethod.POST)
	public String send(@RequestParam("id1")String id, Model model) {
		model.addAttribute("msg", "Hi. "+id+" !!");
		model.addAttribute("id2", id);
		return "index02";
	}
	
	//컨트롤러에서 템플릿으로 값 전달
	
	@RequestMapping("/index01")
	public String index01() {
		return "index01";
	}
	
	@RequestMapping("/index01/{num}")
	public String index01(@PathVariable int num, Model model) {
		int res = num;
		model.addAttribute("msg", "num : " + res);
		return "index01";
	}
	
	
}
