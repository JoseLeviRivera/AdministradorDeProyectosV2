package com.example.biblioteca.controller;

import com.example.biblioteca.model.Bitacora;
import com.example.biblioteca.model.Historia;
import com.example.biblioteca.services.BitacoraServicio;
import com.example.biblioteca.services.HistoriaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BitacoraController {

    @Autowired
    private BitacoraServicio bitacoraServicio;
    @Autowired
    private HistoriaServicios historiasServicios;

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

}
