package com.example.biblioteca.servicesImp;

import java.util.List;

import com.example.biblioteca.interfaces.SprintRepository;
import com.example.biblioteca.model.Sprint;
import com.example.biblioteca.services.SprintServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SprintServicioImpl implements SprintServicio {

    @Autowired
    private SprintRepository repositorio;

    @Override
    public List<Sprint> listarSprints() {
        return repositorio.findAll();
    }

    @Override
    public Sprint guardarSprint(Sprint sprint) {
        return this.repositorio.save(sprint);
    }

    @Override
    public Sprint obtenerSprintId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Sprint actualizarSprint(Sprint sprint) {
        return repositorio.save(sprint);
    }

    @Override
    public void eliminarSprint(Long id) {
        repositorio.deleteById(id);
    }


}
