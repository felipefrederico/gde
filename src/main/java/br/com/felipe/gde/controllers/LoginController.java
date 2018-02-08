package br.com.felipe.gde.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.felipe.gde.entities.User;

@Controller
public class LoginController {

	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
	
		return "/login/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user) {
		
		System.out.println("Nome: " + user.getName() + " Senha: " + user.getPassword());
		
		return "redirect:/login";
	}
	
}
