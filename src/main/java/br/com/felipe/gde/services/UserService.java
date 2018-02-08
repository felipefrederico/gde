package br.com.felipe.gde.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.felipe.gde.entities.User;
import br.com.felipe.gde.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;	
	
	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}
	
}
