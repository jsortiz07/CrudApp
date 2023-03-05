package com.johanapp.demo.controlador;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.johanapp.demo.interfaceService.IPersonaService;
import com.johanapp.demo.modelo.Persona;

@Controller
@RequestMapping
public class Controlador {
	
	

	@Autowired
	private IPersonaService personaService;
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
	
		List<Persona>personas =personaService.listar();
		model.addAttribute("Personas",personas);
		
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("persona",new Persona());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Persona p, Model model) {
		personaService.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("edit/{id}")
	public String editar(Model model,@PathVariable int id) {
		Optional<Persona> persona = personaService.listarId(id);
		model.addAttribute("persona",persona);
		return "form";
	}
}
