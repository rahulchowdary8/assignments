package com.rahul;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
		
	@RequestMapping(value="/hellomsg.html", method = RequestMethod.GET, 
				produces=MediaType.APPLICATION_JSON_VALUE)
	public String hello() {
		
		return "Hello World";
	}
}
