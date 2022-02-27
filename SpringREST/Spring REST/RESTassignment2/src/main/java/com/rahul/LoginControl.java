package com.rahul;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginControl {
	
	@RequestMapping(value="/login.html" , method = RequestMethod.GET)
	public ModelAndView go() {
		
		ModelAndView m = new ModelAndView("login");
		return m;
	}
}
