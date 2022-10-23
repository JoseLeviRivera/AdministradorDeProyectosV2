package com.example.biblioteca.servicesImp;


import com.example.biblioteca.interfaces.BitacoraRepository;
import com.example.biblioteca.model.Bitacora;
import com.example.biblioteca.services.BitacoraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BitacoraServicioImpl implements BitacoraServicio {

    @Autowired
    private BitacoraRepository repositorio;

    @Override
    public List<Bitacora> listaTiempos() {
        return repositorio.findAll();
    }

    @Override
    public Bitacora guardarTiempo(Bitacora b) {
        return this.repositorio.save(b);
    }

    @Override
    public Bitacora obtenerTiempoId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Bitacora actualizarTiempo(Bitacora b) {
        return repositorio.save(b);
    }

    @Override
    public void eliminarTiempo(Long id) {
        repositorio.deleteById(id);
    }

}

