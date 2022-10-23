package com.example.biblioteca.services;

import java.util.List;

import com.example.biblioteca.model.Proyecto;

public interface ProyectoServicios {
	public List<Proyecto> listarProyectos();
	public Proyecto registrarProyecto(Proyecto proyecto);
	public Proyecto obtenerProyectoID(Integer id);
	public Proyecto actualizarProyecto(Proyecto proyecto);
	public void eliminarProyecto(Integer id);
}