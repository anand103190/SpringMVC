package com.as.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/mvc")
	public ModelAndView helloWould() {
		String message = "Welcome to java4s.com Spring MVC 3.2.x Sessions";
		message += "<br>You Did it....!";

		return new ModelAndView("welcomePage", "welcomeMessage", message);
	}
}
