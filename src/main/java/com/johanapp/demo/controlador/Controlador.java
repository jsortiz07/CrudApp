package com.johanapp.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
