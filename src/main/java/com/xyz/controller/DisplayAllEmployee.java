package com.xyz.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.xyz.dao.UserRepository;
import com.xyz.entity.Employee;

@Controller
public class DisplayAllEmployee {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/")
	public String getAllmyEmployee(Model m) {
		List<Employee> Allemployee = (List<Employee>) repo.findAll();
		m.addAttribute("Allemployee",Allemployee);
		return "index";
	}
	
}
