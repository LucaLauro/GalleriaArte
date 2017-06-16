package it.uniroma3.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.spring.model.Autore;

public interface AutoreRepository extends CrudRepository<Autore,Long>{

	  List<Autore> findByCognome(String cognome);
	  List<Autore> findByNazionalita(String nazionalita);
}
