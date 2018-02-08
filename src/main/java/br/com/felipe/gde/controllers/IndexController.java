package br.com.felipe.gde.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.felipe.gde.services.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
		
	@RequestMapping("/")
	public String index(Model model) {
	
		model.addAttribute("users", userService.getAllUser());
			
		return "index";
	}
	
}
