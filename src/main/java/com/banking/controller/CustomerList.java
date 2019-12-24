package com.banking.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.banking.service.CustomerService;

@Controller
public class CustomerList {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/customerList")
	public ModelAndView contromer(Map<String, Object> map) {
		// customerService.getAllCustomer();
		map.put("customer", customerService.getAllCustomer());
		return new ModelAndView("costomerlist");
	}

}
