package com.santosh.spring.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.santosh.spring.mvc.model.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping("/employee")
	public String employee(ModelMap model) {
		System.out.println("SANTOSH*****************1");
		Employee employee = new Employee();
		employee.setId(00001);
		employee.setFirstName("firstName");
		employee.setLastName("lastName");
		employee.setDepartment("department");
		employee.setSalary(100000);
		model.addAttribute("employee", employee);
		System.out.println("SANTOSH*****************2");
		return "employeeview";
	}
	
	@ResponseBody
	@RequestMapping("/")
	public String index() {
		return "Spring boot Thymeleaf app";
	}
	
}