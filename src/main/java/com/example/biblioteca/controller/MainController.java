package com.example.biblioteca.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
	/*
	@Autowired
	private SprintServicio servicio;
	
	@Autowired
	private BitacoraServicio bitacoraServicio;
	
	@Autowired
	private ProyectoServicios pryServ;
	
	@Autowired
	private HistoriaServicios historiasServicios;

	@GetMapping(path = "/")
	public String home(Model model) {
		return "Inicio";
	}
	
	@GetMapping(path = "/listar")
	public  String listarSprints(Model model) {
		model.addAttribute("ListaSprints", servicio.listarSprints());
		return "listarSprint";
	}
	
	@GetMapping(path = "/Sprint/listar")
	public  String listadoSprints(Model model) {
		model.addAttribute("ListaSprints", servicio.listarSprints());
		return "listarSprint";
	}
	
	@GetMapping(path = "/Sprint/agregar")
	public  String agregarSprintForm(Model model) {
		Sprint s = new Sprint();
		model.addAttribute("sprint", s);
		model.addAttribute("proyectos", pryServ.listarProyectos());
		return "insertarSprint";
	}
	
	
	@PostMapping(path = "/Sprint/agregar")
	public  String registrarForm(@ModelAttribute Sprint sprint) {
		servicio.guardarSprint(sprint);
		return "redirect:/listar";
	}

	@GetMapping(path = "/Sprint/actualizar/{id}")
	public String actualizarSprintForm(@PathVariable Long id, Model model) {
		Sprint s = servicio.obtenerSprintId(id);
		model.addAttribute("sprint", s);
		return "actualizarSprint";
	}
	
	@PostMapping(path = "/Sprint/actualizar/{id}")
	public String actualizarProyecto(@PathVariable Long id,
			@ModelAttribute("sprint") Sprint s,
			Model modelo) {
	
		servicio.actualizarSprint(s);
		return "redirect:/listar";
	}
	
	
	@GetMapping("/Sprint/eliminar/{id}")
	public String eliminarSprint(@PathVariable Long id, Model model) {
		servicio.eliminarSprint(id);
		model.addAttribute("ListaSprints", servicio.listarSprints());
		return "redirect:/listar"; 
	}
	
	
	// Rutas para bitacora de tiempos 
	@GetMapping(path = "/Bitacora/agregar")
	public String agregarTiempos(Model model) {
		Bitacora s = new Bitacora();
		model.addAttribute("bitacora", s);
		model.addAttribute("historias", historiasServicios.listarHistorias());
		return "agregarBitacoraTiempos";
	}
	

	@PostMapping(path = "/Bitacora/agregar")
	public  String agregarBitacoraForm(@ModelAttribute("bitacora") Bitacora bitacora ) {
		Historia historia = historiasServicios.obtenerHistoriaID(bitacora.getHistoria().getId());
		bitacora.setHistoria(historia);
		this.bitacoraServicio.guardarTiempo(bitacora);	
		return "redirect:/Bitacora/listar";
	}
	
	@GetMapping(path = "/Bitacora/actualizar/{id}")
	public String actualizarBitacoraForm(@PathVariable Long id, Model model) {
		Bitacora s = bitacoraServicio.obtenerTiempoId(id);
		model.addAttribute("bitacora", s);
		model.addAttribute("historias", historiasServicios.listarHistorias());
		return "actualizarBitacoraTiempos";
	}
	
	@PostMapping(path = "/Bitacora/actualizar/{id}")
	public String actualizarBitacora(@PathVariable Long id, @ModelAttribute("bitacora") Bitacora bitacora, Model modelo) {
		Historia historia = historiasServicios.obtenerHistoriaID(bitacora.getHistoria().getId());
		bitacora.setHistoria(historia);
		bitacoraServicio.actualizarTiempo(bitacora);
		return "redirect:/Bitacora/listar"; 
	}
	
	@GetMapping(path = "/Bitacora/listar")
	public  String listarBitacora(Model model) {
		model.addAttribute("ListaBitacora", bitacoraServicio.listaTiempos());
		return "listarBitacoraTiempos";
	}
	
	
	@GetMapping("/Bitacora/eliminar/{id}")
	public String eliminarBitacora(@PathVariable Long id, Model model) {
		bitacoraServicio.eliminarTiempo(id);
		model.addAttribute("ListaBitacora", bitacoraServicio.listaTiempos());
		return "redirect:/Bitacora/listar"; 
	}

	 */
	
}
