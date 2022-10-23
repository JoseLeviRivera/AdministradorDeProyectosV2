package com.example.biblioteca.servicesImp;


import com.example.biblioteca.interfaces.HistoriaRepository;
import com.example.biblioteca.model.Historia;
import com.example.biblioteca.services.HistoriaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriaServicioImp implements HistoriaServicios {

	@Autowired
	private HistoriaRepository histRepos;
	
	@Override
	public List<Historia> listarHistorias() {
		return histRepos.findAll();
	}

	@Override
	public Historia registrarHistoria(Historia historia) {
		return histRepos.save(historia);
	}

	@Override
	public Historia obtenerHistoriaID(Integer id) {
		return histRepos.findById(id).get();
	}

	@Override
	public Historia actualizarHistoria(Historia historia) {	
		return histRepos.save(historia);
	}

	@Override
	public void eliminarHistoria(Integer id) {		
		histRepos.deleteById(id); 
	}

}
