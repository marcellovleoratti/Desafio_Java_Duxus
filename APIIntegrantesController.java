package br.com.desafio.duxus.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.duxus.model.Integrante;
import br.com.desafio.duxus.repository.Integrante_repository;
import br.com.desafio.duxus.repository.Times_repository;

@RestController
@RequestMapping("/api/integrante")
public class APIIntegrantesController {
	
	@Autowired
	private Integrante_repository rp;
	
	
	@GetMapping()
	public List<Integrante> getIntegrante(){
		return rp.findAll();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Integrante getIntegranteById(@PathVariable Long id) {
		
		Optional<Integrante> integrante = rp.findById(id);
		
		return integrante.get();
	}
	
	@PostMapping()
	public void integrante(@RequestBody Integrante integrante){
		rp.save(integrante);
	}
	
	@GetMapping("/{idIntegrante}")
	public List<Integrante> getIntegranteByIdIntegrante(@PathVariable Long idIntegrante) {
		return rp.findByIdIntegrante(idIntegrante);
	}
	
	@GetMapping("/{franquia}")
	public List<Integrante> getIntegrantePorFranquia(@PathVariable String franquia) {
		return rp.findByFranquia(franquia);
	}
	
	@GetMapping("/{nome}")
	public List<Integrante> getIntegrantePorNome(@PathVariable String nome) {
		return rp.findByNome(nome);
	}

	@GetMapping("/{funcao}")
	public List<Integrante> getIntegrantePorFuncao(@PathVariable String funcao) {
		return rp.findByfuncao(funcao);
	}
	
	@GetMapping("/{exemplo_integrante}")
	public List<Integrante> getIntegrantePorExemplo_Integrante(@PathVariable String exemplo_integrante) {
		return rp.findByNome(exemplo_integrante);
	}

}
