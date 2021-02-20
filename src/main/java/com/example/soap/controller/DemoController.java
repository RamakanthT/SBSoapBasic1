package com.example.soap.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.soap.model.EmployeeListVO;
import com.example.soap.model.EmployeeVO;

@RestController
public class DemoController {

	@RequestMapping(value = "/employees")
	public EmployeeListVO getAllEmployees() {
		EmployeeListVO employees = new EmployeeListVO();

		EmployeeVO empOne = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
		EmployeeVO empTwo = new EmployeeVO(2, "Amit", "Singhal", "asinghal@yahoo.com");
		EmployeeVO empThree = new EmployeeVO(3, "Kirti", "Mishra", "kmishra@gmail.com");

		employees.getEmployees().add(empOne);
		employees.getEmployees().add(empTwo);
		employees.getEmployees().add(empThree);

		return employees;
	}

	@RequestMapping(value = "/employees/{id}")
	public EmployeeVO getEmployeeById(@PathVariable("id") int id) {
		System.out.println("in getEmployeeById method");
		if (id <= 3) {
			EmployeeVO employee = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
			//return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);	
			 
			
					    return employee;
					    
					    
		}
		
		return null;
		   
		    
	}

}
