package com.dreamworth.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dreamworth.dto.EmployeeDTO;
import com.dreamworth.service.EmployeeService;

/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {
	
	
	private EmployeeService service;

	public EmployeeService getService() {
		return service;
	}

	
	public void setService(EmployeeService service) {
		this.service = service;
	}

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home() {
		return "login";
	}
	
	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public String register()
	{
		return "registration";
	}
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute EmployeeDTO employee)	
	{
		String result=null;
		result=service.insertEmployee(employee);
		ModelAndView model=new ModelAndView();
		model.addObject("result", result);
		return model;
		
		
	}
	
}
