package com.johanapp.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.johanapp.demo.modelo.Persona;
public interface IPersonaService {
	
	public List<Persona> listar();
	public Optional<Persona>listarId(int id);
	public String save(Persona p);
	public void delete(int id);
}
