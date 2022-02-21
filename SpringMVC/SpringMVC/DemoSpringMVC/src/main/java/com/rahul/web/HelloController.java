package com.rahul.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
     @RequestMapping("/welcome")
	public ModelAndView assignment() {
    	  ModelAndView hello = new ModelAndView("index1");
    	  
    	  return hello;
    	  
    	  
      }
     @RequestMapping("/helloworld")
     public ModelAndView capgemini() {
    	 ModelAndView punjab = new ModelAndView("helloworld");
    	 
    	 return punjab;
     }
}
