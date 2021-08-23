package br.com.desafio.duxus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.desafio.duxus.model.Times;

public interface Times_repository extends JpaRepository<Times, Long> {
	
	public List<Times> findByID(Long id);
	public List<Times> findByid_time(Long id_time);
}
