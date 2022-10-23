package com.example.biblioteca.services;

import java.util.List;

import com.example.biblioteca.model.Bitacora;

public interface BitacoraServicio {
	public List<Bitacora> listaTiempos();
	public Bitacora guardarTiempo(Bitacora b);
	public Bitacora obtenerTiempoId(Long id);
	public Bitacora actualizarTiempo(Bitacora b);
	public void eliminarTiempo(Long id);
}
