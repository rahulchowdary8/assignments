package com.rahul;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {
	
	// getting the REGISTRATION view
	@RequestMapping(value = "/registration.html" , method = RequestMethod.GET)
	public ModelAndView regDetails() {
			
			ModelAndView m = new ModelAndView("registration");
			return m;
		}
	
	// getting the RESULT view
	@RequestMapping(value = "/submitdetails.html" , method = RequestMethod.POST)
	public ModelAndView subDetails(@Valid @ModelAttribute("customer1") Customer customer1, BindingResult result) 
	{
		
		if(result.hasErrors()) {
		  
			  ModelAndView m1 = new ModelAndView("registration");
			  return m1; 
		}else {
			
			  ModelAndView m = new ModelAndView("success");
			  m.addObject("top", "DETAILS SUBMITTED SUCCESSFULLY....." );
			  return m;
		}
	}
}
