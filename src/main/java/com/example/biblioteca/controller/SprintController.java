package com.example.biblioteca.controller;

import com.example.biblioteca.model.Sprint;
import com.example.biblioteca.services.ProyectoServicios;
import com.example.biblioteca.services.SprintServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SprintController {
    @Autowired
    private SprintServicio servicio;
    @Autowired
    private ProyectoServicios pryServ;

    @GetMapping(path = "/")
    public String home(Model model) {
        return "Inicio";
    }

    @GetMapping(path = "/listar")
    public String listarSprints(Model model) {
        model.addAttribute("ListaSprints", servicio.listarSprints());
        return "listarSprint";
    }

    @GetMapping(path = "/Sprint/listar")
    public String listadoSprints(Model model) {
        model.addAttribute("ListaSprints", servicio.listarSprints());
        return "listarSprint";
    }

    @GetMapping(path = "/Sprint/agregar")
    public String agregarSprintForm(Model model) {
        Sprint s = new Sprint();
        model.addAttribute("sprint", s);
        model.addAttribute("proyectos", pryServ.listarProyectos());
        return "insertarSprint";
    }


    @PostMapping(path = "/Sprint/agregar")
    public String registrarForm(@ModelAttribute Sprint sprint) {
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
}
