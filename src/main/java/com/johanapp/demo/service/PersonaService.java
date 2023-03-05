package com.johanapp.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.johanapp.demo.interfaceService.IPersonaService;
import com.johanapp.demo.interfaces.IPersona;
import com.johanapp.demo.modelo.Persona;

public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona data;
	
	@Override
	public List<Persona> listar() {
		
		return data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String save(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
