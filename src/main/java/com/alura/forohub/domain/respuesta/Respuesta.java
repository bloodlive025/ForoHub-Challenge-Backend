package com.alura.forohub.domain.respuesta;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "Respuesta")
@Table(name = "respuestas")
@Setter
@EqualsAndHashCode(of = "id")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private Long topico_id;
    private LocalDate fecha_creacion;
    private Long usuario_id;
    private String solucion;

    public Respuesta(Long id, String mensaje, Long topico_id, LocalDate fecha_creacion, Long usuario_id, String solucion) {
        this.id = id;
        this.mensaje = mensaje;
        this.topico_id = topico_id;
        this.fecha_creacion = fecha_creacion;
        this.usuario_id = usuario_id;
        this.solucion = solucion;
    }

    public Respuesta(){

    }

    public Long getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Long getTopico_id() {
        return topico_id;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public String getSolucion() {
        return solucion;
    }
}
