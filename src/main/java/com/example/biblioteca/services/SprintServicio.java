package com.example.biblioteca.services;

import java.util.List;

import com.example.biblioteca.model.Sprint;

public interface SprintServicio {
	public List<Sprint> listarSprints();
	public Sprint guardarSprint(Sprint sprint);
	public Sprint obtenerSprintId(Long id);
	public Sprint actualizarSprint(Sprint sprint);
	public void eliminarSprint(Long id);
}
