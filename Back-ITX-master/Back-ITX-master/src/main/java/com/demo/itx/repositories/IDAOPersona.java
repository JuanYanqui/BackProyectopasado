package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Persona;

public interface IDAOPersona {

	Persona crear(Persona persona);

	Optional<Persona> porId(Long idPersona);

	List<Persona> listar();

	Persona actualizar(Persona persona, Long idPersona);

	boolean eliminar(Long idPersona);

	Persona porCedula(String cedula);
}
