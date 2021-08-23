package br.com.desafio.duxus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.desafio.duxus.model.Times;
import br.com.desafio.duxus.repository.Times_repository;

@RestController
@RequestMapping("/times")
public class Times_controller {

	@Autowired
	private Times_repository rep;
	
	
	@RequestMapping("/salvar")
	public ModelAndView salvar(@Valid @ModelAttribute Times times, Errors erros) {
		
		ModelAndView mv = new ModelAndView("cadastro-times");
		
		if(erros.hasErrors()) {
			return mv;			
		}
		
		rep.save(times);
		mv.addObject("mensagem", "Despesa registrada com sucesso!");
		mv.addObject("rep", new Times());
		
		return mv;
	}

	
	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("cadastro-times");
		mv.addObject("times", new Times());
		
		return mv;
	}
}
