package br.com.desafio.duxus.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.desafio.duxus.model.Integrante;
import br.com.desafio.duxus.repository.Integrante_repository;

@RestController
@RequestMapping("/integrante")
public class Integrante_controller {
	
	@Autowired
	private Integrante_repository rpInt;
	
	@RequestMapping("/salvar")
	public ModelAndView Salvar(@Valid @ModelAttribute Integrante integrante, Errors erros) {
		
		ModelAndView mv = new ModelAndView("cadastroIntegrante");
		
		if(erros.hasErrors()) {
			return mv;
		}
		
		rpInt.save(integrante);
		mv.addObject("messagem", "Integrante Cadastrado com Sucesso");
		mv.addObject("integrante", new Integrante());
		return mv;
	}
	
	@GetMapping
	public ModelAndView franquia(@RequestParam(defaultValue="")String franquia ) {
		
		ModelAndView mv = new ModelAndView("listagem-integrante");
		
		List<Integrante> integrante = rpInt.findByfuncao(franquia);			
						
		mv.addObject("integrante",integrante);
		
		return mv;
	}
	
	@GetMapping
	public ModelAndView nome(@RequestParam(defaultValue="")String nome ) {
		
		ModelAndView mv = new ModelAndView("listagem-integrante");
		
		List<Integrante> integrante = rpInt.findByNome(nome);			
						
		mv.addObject("integrante",integrante);
		
		return mv;
	}
	
	@GetMapping
	public ModelAndView funcao(@RequestParam(defaultValue="")String funcao ) {
		
		ModelAndView mv = new ModelAndView("listagem-integrante");
		
		List<Integrante> integrante = rpInt.findByfuncao(funcao);			
						
		mv.addObject("integrante",integrante);
		
		return mv;
	}
	
	@GetMapping
	public ModelAndView exemplo_integrante(@RequestParam(defaultValue="")String exemplo_integrante ) {
		
		ModelAndView mv = new ModelAndView("listagem-integrante");
		
		List<Integrante> integrante = rpInt.findByExemploPorIntegrante(exemplo_integrante);			
						
		mv.addObject("integrante",integrante);
		
		return mv;
	}
	
	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("cadastroIntegrante");
		mv.addObject("integrante", new Integrante());
		
		return mv;
	}
}
