package br.com.felipe.gde.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.felipe.gde.entities.Event;

public interface EventoRepository extends CrudRepository<Event, Long> {

}
