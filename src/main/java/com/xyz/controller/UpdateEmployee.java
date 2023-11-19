package com.xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.xyz.dao.UserRepository;
import com.xyz.entity.Employee;

import jakarta.servlet.http.HttpSession;


@Controller
public class UpdateEmployee {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/edit/{id}")
	public String applyModification(@PathVariable int id,Model m) {
		Employee ans = repo.findBymyId(id);
		m.addAttribute("emp",ans);
		return "editpage";
	}
	
	@PostMapping("/addchange")
	public String saveChanges(@ModelAttribute Employee e,HttpSession session) {
		repo.save(e);
		session.setAttribute("mymsg", "Sucessfully edited!");
		return "redirect:/";
	}
}
