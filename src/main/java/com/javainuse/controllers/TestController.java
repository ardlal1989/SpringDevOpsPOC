package com.javainuse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

@Controller
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	@ResponseBody
	public Employee firstPage(Employee employee) {

		
		return employee;
	}
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(4000);

		return emp;
	}
	@RequestMapping(value = "/")
	public String hello()
	{
		return "index";
	}
	

}
