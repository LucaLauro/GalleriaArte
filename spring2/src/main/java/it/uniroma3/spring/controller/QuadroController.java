package it.uniroma3.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.uniroma3.spring.model.Autore;
import it.uniroma3.spring.model.Quadro;
import it.uniroma3.spring.service.AutoreService;
import it.uniroma3.spring.service.QuadroService;


@Controller
public class QuadroController  {
	
    @Autowired
    private QuadroService quadroservice; 
    @Autowired
    private AutoreService autoreservice;

    @GetMapping("/quadro")
    public String showForm(Quadro quadro,Model model) {
    	Iterable<Autore> source = this.autoreservice.findAll();
    	List<Autore> autori = new ArrayList<>();
    	source.forEach(autori::add);
    	model.addAttribute("autori",autori);
    	return "form";
    }

    @PostMapping("/quadro")
    public String checkQuadroInfo(@Valid @ModelAttribute Quadro quadro, 
    									BindingResult bindingResult, Model model) {
    	
        if (bindingResult.hasErrors()) {
        	Iterable<Autore> source = this.autoreservice.findAll();
        	List<Autore> autori = new ArrayList<>();
        	source.forEach(autori::add);
        	model.addAttribute("autori",autori);
            return "form";
        }
        else {
        	model.addAttribute(quadro);
            quadroservice.add(quadro); 
        }
        return "mostraQuadro";
    }
    @RequestMapping("/quadri")
    public String listaAutore(Model model){
    	Iterable<Quadro> source = this.quadroservice.findAll();
    	List<Quadro> quadri = new ArrayList<>();
    	source.forEach(quadri::add);
    	model.addAttribute("quadri",quadri);
    	return"quadri";
    }
}
