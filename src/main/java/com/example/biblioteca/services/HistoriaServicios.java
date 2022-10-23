package com.example.biblioteca.services;

import java.util.List;

import com.example.biblioteca.model.Historia;

public interface HistoriaServicios {
	public List<Historia> listarHistorias();
	public Historia registrarHistoria(Historia historia);
	public Historia obtenerHistoriaID(Integer id);
	public Historia actualizarHistoria(Historia historia);
	public void eliminarHistoria(Integer id);
}
