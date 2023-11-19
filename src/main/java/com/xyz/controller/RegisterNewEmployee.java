package com.xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.xyz.dao.UserRepository;
import com.xyz.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class RegisterNewEmployee {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/registerEmp")
	public String getadd() {
		return "registerEmployee";
	}
	
	@PostMapping("/register")
	public String addEmployee(@ModelAttribute Employee e,HttpServletRequest request) {
		repo.save(e);	
		HttpSession session = request.getSession();
		session.setAttribute("mymsg", "Employee added sucessfully!");
		return "redirect:/";
	}
}
