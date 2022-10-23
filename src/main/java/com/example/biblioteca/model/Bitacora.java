package com.example.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;

@Entity
@Table(name = "bitacora")
public class Bitacora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10, name = "fecha_inicio")
    private String fechaInicio;

    @Column(nullable = false, length = 10, name = "fechaFinal")
    private String fechaFinal;

    @Column(nullable = false, length = 10, name = "hora_inicio")
    private String hora_inicio;

    @Column(nullable = false, length = 10, name = "hora_final")
    private String hora_final;

    @Column(nullable = false, length = 10, name = "interrupcion")
    private String interrupcion;

    @Column(nullable = false, length = 45, name = "etapa")
    private String etapa;

    @Column(nullable = false, length = 45, name = "descripcion_actividada")
    private String descripcion_actividada;

    @Column(nullable = false, length = 45, name = "artefacto")
    private String artefacto;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Historia historia;

    public Bitacora() {
    }


    public Bitacora(String fechaInicio, String fechaFinal, String hora_inicio, String hora_final, String interrupcion,
                    String etapa, String descripcion_actividada, String artefacto, Historia historia) {
        super();
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.interrupcion = interrupcion;
        this.etapa = etapa;
        this.descripcion_actividada = descripcion_actividada;
        this.artefacto = artefacto;
        this.historia = historia;
    }


    public Historia getHistoria() {
        return historia;
    }


    public void setHistoria(Historia historia) {
        this.historia = historia;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_final() {
        return hora_final;
    }

    public void setHora_final(String hora_final) {
        this.hora_final = hora_final;
    }

    public String getInterrupcion() {
        return interrupcion;
    }

    public void setInterrupcion(String interrupcion) {
        this.interrupcion = interrupcion;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getDescripcion_actividada() {
        return descripcion_actividada;
    }

    public void setDescripcion_actividada(String descripcion_actividada) {
        this.descripcion_actividada = descripcion_actividada;
    }

    public String getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(String artefacto) {
        this.artefacto = artefacto;
    }
}
