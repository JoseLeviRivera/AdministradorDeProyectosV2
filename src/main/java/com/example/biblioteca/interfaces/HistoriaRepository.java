package com.example.biblioteca.interfaces;


import com.example.biblioteca.model.Historia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriaRepository extends JpaRepository<Historia, Integer> {

}
