package com.Gentelella.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/index2")
	public String index2() {
		return "redirect:/index2";
	}
	
	@RequestMapping("/index3")
	public String index3() {
		return "redirect:/index3";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/fixed_sidebar")
	public String fixed_sidebar() {
		return "fixed_sidebar";
	}
	
	@RequestMapping("/fixed_footer")
	public String fixed_footer() {
		return "/fixed_footer";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "login";
	}
}
