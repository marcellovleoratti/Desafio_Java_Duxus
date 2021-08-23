package br.com.desafio.duxus.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.duxus.model.Integrante;

public interface Integrante_repository extends JpaRepository<Integrante, Long> {

	public List<Integrante> findByID(Long id);
	public List<Integrante> findByIdIntegrante(Long id_integrante);
	public List<Integrante> findByFranquia(String franquia);
	public List<Integrante> findByNome(String nome);
	public List<Integrante> findByfuncao(String funcao);
	public List<Integrante> findByExemploPorIntegrante(String exemplo_integrante);
}
