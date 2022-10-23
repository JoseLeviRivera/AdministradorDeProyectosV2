package com.example.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "historias")
public class Historia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Historia")
    private Integer id;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(nullable = false, length = 150)
    private String descripcion;
    @Column(nullable = false, length = 2)
    private String peso;
    @Column(nullable = false, length = 10)
    private String idUsuario;
    @Column(nullable = false, length = 15)
    private String estado;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Proyecto proyectoAsociado;

    @JsonBackReference
    @OneToMany(
            mappedBy = "historia",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<Bitacora> listaBitacoras;


    public Historia() {
    }


    public Historia(String nombre, String descripcion, String peso, String idUsuario, String estado,
                    Proyecto proyectoAsociado, List<Bitacora> listaBitacoras) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.idUsuario = idUsuario;
        this.estado = estado;
        this.proyectoAsociado = proyectoAsociado;
        this.listaBitacoras = listaBitacoras;
    }


    public List<Bitacora> getListaBitacoras() {
        return listaBitacoras;
    }


    public void setListaBitacoras(List<Bitacora> listaBitacoras) {
        this.listaBitacoras = listaBitacoras;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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


    public String getPeso() {
        return peso;
    }


    public void setPeso(String peso) {
        this.peso = peso;
    }


    public String getIdUsuario() {
        return idUsuario;
    }


    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public Proyecto getProyectoAsociado() {
        return proyectoAsociado;
    }


    public void setProyectoAsociado(Proyecto proyectoAsociado) {
        this.proyectoAsociado = proyectoAsociado;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Historia))
            return false;
        return proyectoAsociado.getId() == ((Historia) o).getProyectoAsociado().getId();

    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
