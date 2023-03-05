package com.johanapp.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johanapp.demo.modelo.Persona;

public interface IPersona extends JpaRepository<Persona, Integer>{

}
