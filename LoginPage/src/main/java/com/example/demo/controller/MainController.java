package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.DAO.IMemberDAO;

@Controller
public class MainController {
	
	@Autowired
	IMemberDAO dao;
	
	@RequestMapping("/")
	public String root() {
		return "signUp";
	}
	@RequestMapping("/LoginCheck")
	public void loginCheck() {
		
	}
}
