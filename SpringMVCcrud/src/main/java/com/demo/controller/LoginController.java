package com.demo.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.User;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService lservice;
	
	@GetMapping("/mylogin")
	public String showLoginForm() {
		return "loginpage";
	}
	
	@PostMapping("/validateuser")
	public ModelAndView validateUser(HttpSession session, @RequestParam String uname ,@RequestParam String pass) {
		User u =  lservice.authenticateUser(uname,pass);
		if(u!=null) {
			session.setAttribute("user", u);
			if(u.getRole().equals("admin")) {
			return new ModelAndView("redirect:/employee/viewemployee");
			}else
				return new ModelAndView("loginpage","msg","Logged in user is not authorised");
		}
		return new ModelAndView("loginpage","msg","credentials are incorrect");
		
	}
	
}
