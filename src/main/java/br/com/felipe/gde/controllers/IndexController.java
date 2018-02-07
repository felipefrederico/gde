package br.com.felipe.gde.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.felipe.gde.entities.User;
import br.com.felipe.gde.repositories.UserRepository;

@Controller
public class IndexController {
	
	private UserRepository userRepository;
	
	public IndexController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		User user = new User();
		user.setEmail("felipe.frederico@gmail.com");
		user.setName("Felipe Frederico");
		user.setPassword("123456");
		userRepository.save(user);
		model.addAttribute("users", userRepository.findAll());
			
		return "index";
	}
	
}
