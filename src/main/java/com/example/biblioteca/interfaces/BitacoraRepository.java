package com.example.biblioteca.interfaces;


import com.example.biblioteca.model.Bitacora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BitacoraRepository extends JpaRepository<Bitacora, Long> {}
