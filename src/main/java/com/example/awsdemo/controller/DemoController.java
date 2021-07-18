package com.example.awsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/awsdemo")
public class DemoController {
	
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public String displayMessage() {
		return "Hello world";
		
	}

}
