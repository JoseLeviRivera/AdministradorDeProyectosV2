package com.example.biblioteca.controller;

import com.example.biblioteca.model.Historia;
import com.example.biblioteca.model.Proyecto;
import com.example.biblioteca.services.HistoriaServicios;
import com.example.biblioteca.services.ProyectoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HistoriaController {
	@Autowired
	private HistoriaServicios histServ;
	@Autowired
	private ProyectoServicios pryServ;
	
	@GetMapping("/historias")
	public String listarHistorias(Model modelo) {
		modelo.addAttribute("historias", histServ.listarHistorias());
		return "historias";
	}	
	
	@GetMapping("/historias/nuevo")
	public String mostrarVistaRegistro(Model modelo) {
		Historia historia = new Historia();
		modelo.addAttribute("proyectos", pryServ.listarProyectos());
		modelo.addAttribute("historia", historia);
		return "historiaNueva";
	}	
	
	@PostMapping("historias/nuevo")
	public String registrarHistoria(@ModelAttribute("historia") Historia historia) {
		Proyecto p = pryServ.obtenerProyectoID(historia.getProyectoAsociado().getId());
		historia.setProyectoAsociado(p);
		histServ.registrarHistoria(historia);		
		return "redirect:/historias";
	}
	
	@GetMapping("/historias/actualizar/{id}")
	public String mostrarVistaActualizar(@PathVariable Integer id, Model modelo, Model modelo2) {
		modelo2.addAttribute("proyectos", pryServ.listarProyectos());
		modelo.addAttribute("historia", histServ.obtenerHistoriaID(id));
		return "actualizarHistoria";
	}
	
	@PostMapping("/historias/{id}")
	public String actualizarHistoria(@PathVariable Integer id, @ModelAttribute("historia") Historia historia, Model modelo) {
		Historia historiaExistente = histServ.obtenerHistoriaID(id);
		historiaExistente.setId(id);
		historiaExistente.setNombre(historia.getNombre());
		historiaExistente.setDescripcion(historia.getDescripcion());
		historiaExistente.setEstado(historia.getEstado());
		historiaExistente.setIdUsuario(historia.getIdUsuario());
		historiaExistente.setPeso(historia.getPeso());
		historiaExistente.setProyectoAsociado(historia.getProyectoAsociado());
		histServ.actualizarHistoria(historiaExistente);
		return "redirect:/historias";
	}
	
	@GetMapping("/historias/{id}")
	public String eliminarHistoria(@PathVariable Integer id) {
		histServ.eliminarHistoria(id);
		return "redirect:/historias";
	}
}
