package com.example.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin")
public class AdminController {

	// localhost:8080/admin/details
	@GetMapping("/details")
	public String getAdminDetails() {
		return "home";
	}
		
}
