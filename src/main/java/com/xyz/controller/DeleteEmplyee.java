package com.xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.xyz.dao.UserRepository;

import jakarta.servlet.http.HttpSession;


@Controller
public class DeleteEmplyee {

	
	@Autowired
	private UserRepository repo;

	@GetMapping("/delete/{id}")
	public String removeMyEmployee(@PathVariable int id,HttpSession session) {
		repo.deleteById(id);
		session.setAttribute("msg", "sucessfully deleted!");
		return "redirect:/";
	}
}
