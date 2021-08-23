package br.com.desafio.duxus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.duxus.model.Times;
import br.com.desafio.duxus.repository.Times_repository;

@RestController
@RequestMapping("/api/times")
public class APITimesController {
	
	@Autowired
	private Times_repository trp;
	
	@GetMapping()
	public List<Times> getTimes(){
		return trp.findAll();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Times getTimesById(@PathVariable Long id) {
		
		Optional<Times> times = trp.findById(id);
		
		return times.get();
	}
	
	@PostMapping()
	public void times(@RequestBody Times times){
		trp.save(times);
	}
	
	@GetMapping("/{idtimes}")
	public List<Times> getIntegranteByIdIntegrante(@PathVariable Long idtimes) {
		return trp.findByid_time(idtimes);
	}
}
