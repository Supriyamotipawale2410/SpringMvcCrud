package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService eservice;

	@GetMapping("/viewemployee")
	public ModelAndView getAllEmp() {
		List<Employee> elist = eservice.showAllEmp();
		return new ModelAndView("displayemployee","elist",elist);
		
	}
	
	@GetMapping("/addnewemployee")
	
	public ModelAndView addNewEmp() {
		Employee em = new Employee();
		return new ModelAndView("addnewemp","e",em);
	}
	
	@PostMapping("/addempdetails")
		public ModelAndView insertNewEmp(@ModelAttribute("e") Employee emp) {
			System.out.println(emp);
			eservice.addNewEmp(emp);
			return new ModelAndView("redirect:/employee/viewemployee");
			
		}
	
	@GetMapping("/editemployee/{id}")
	public ModelAndView editEmp(@PathVariable("id") int id) {
		Employee e = eservice.getbyId(id);
		System.out.println(e);
		return new ModelAndView("editemp","e",e);
	}
	
	@PostMapping("/updateemp")
	public ModelAndView updateEmp(@ModelAttribute("e") Employee e) {
		System.out.println(e);
		eservice.updateEmp(e);
		return new ModelAndView("redirect:/employee/viewemployee");
	}
	
	@GetMapping("/deleteemployee/{id}")
	public ModelAndView deleteEmp(@PathVariable("id") int id) {
		System.out.println(id);
		eservice.deleteEmp(id);
		return new ModelAndView("redirect:/employee/viewemployee");
	}
	
}
