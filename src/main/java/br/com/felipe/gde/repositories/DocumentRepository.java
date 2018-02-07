package br.com.felipe.gde.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.felipe.gde.entities.Document;

public interface DocumentRepository extends CrudRepository<Document, Long>{

}
