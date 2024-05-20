package com.aj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MessageController {
	
	@GetMapping("/welcome")
	public static ModelAndView getMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to my world");
		mav.setViewName("message");
		return mav;
	}
	
	@GetMapping("/greet")
	public static ModelAndView getGreeting() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Good Morning");
		mav.setViewName("message");
		return mav;
	}

}
