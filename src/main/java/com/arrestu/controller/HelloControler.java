package com.arrestu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HelloControler {

@RequestMapping("/")
public String show()
{
return "hello";	
}
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
		public String index(ModelMap model){
		model.addAttribute("message", "Hello Spring WEB MVC");
		return "hello";
		
		
		
		
		
	}

}
