package com.example.biblioteca.model;

import javax.persistence.*;

@Entity
@Table(name = "sprint")
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 45, name = "nombre")
    private String nombre;
    @Column(nullable = false, length = 100, name = "descripcion")
    private String descripcion;
    @Column(nullable = false, length = 100, name = "fecha_inicial")
    private String fecha_inicial;
    @Column(nullable = false, length = 100, name = "fecha_final")
    private String fecha_final;
    @Column(nullable = false, name = "dias")
    private Integer dias;
    @Column(nullable = false, name = "estado")
    private String estado;

    public Sprint() {
    }

    public Sprint(String nombre, String descripcion, String fecha_inicial, String fecha_final, Integer dias, String estado) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
        this.dias = dias;
        this.estado = estado;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(String fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}