package com.RegistrationForm.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.RegistrationForm.entity.User;
import com.RegistrationForm.service.UserService;



@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@GetMapping("/")
	
	public String Main() {
		
		return "register";
	}
	
	@GetMapping("/login")
	public String Login() {
		return "index";
	}
	
	
	@GetMapping("/register")
	
	public String registerpage() {
		return "register";
	}
	
	
	@PostMapping("/register")
	public String registeruser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
		userservice.saveuser(user);
		redirectAttributes.addFlashAttribute("successMessage", "Registration successful!");
        return "redirect:/register";
}
	
	
	@PostMapping("/login")
public String login(@RequestParam("email") String email,
                    @RequestParam("password") String password, 
                    Model model) {
    if (userservice.authenticateUser(email, password)) {
        // Redirect to welcome page if login is successful
        return "welcome"; // Or whatever your login success page is
    } else {
        // Add error message to the model
        model.addAttribute("error", "Invalid email or password");
        return "index"; // Return to the login page
    }
}
	
	
	
	}

