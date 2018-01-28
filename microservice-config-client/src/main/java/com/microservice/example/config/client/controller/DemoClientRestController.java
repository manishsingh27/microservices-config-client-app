package com.microservice.example.config.client.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class DemoClientRestController {
	
	@Value("${demo.prop}")
	String demoProp;
	
	@RequestMapping(value = "getPropValues", method = RequestMethod.GET)
	public String getDemoProp (final HttpServletRequest request) {				
		return "prop value is- " + demoProp;
	}

}
