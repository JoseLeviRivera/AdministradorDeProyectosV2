package com.example.biblioteca.interfaces;


import com.example.biblioteca.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {

}
