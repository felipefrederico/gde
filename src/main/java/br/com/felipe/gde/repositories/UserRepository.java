package br.com.felipe.gde.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.felipe.gde.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

	
}
