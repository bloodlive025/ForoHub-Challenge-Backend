package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.Status;
import com.alura.forohub.domain.curso.Curso;
import com.alura.forohub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "Topico")
@Table(name = "topicos")

@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDate fecha_creacion;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    @JoinColumn(name = "usuario_id" , nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "curso_id" , nullable = false)
    private Curso curso;

    public Topico(DatosTopicoDTO datosTopicoDTO){
        this.titulo  = datosTopicoDTO.titulo();
        this.mensaje = datosTopicoDTO.mensaje();
        this.fecha_creacion = LocalDate.parse(datosTopicoDTO.fecha_creacion());
        this.status = Status.valueOf(datosTopicoDTO.status());
        this.usuario = new Usuario(datosTopicoDTO.usuario());
        this.curso = new Curso(datosTopicoDTO.curso());
    }

    public void actualizarTopico(DatosActualizarTopicoDTO datosActualizarTopicoDTO){
        if(datosActualizarTopicoDTO.mensaje() != null){
            this.mensaje = datosActualizarTopicoDTO.mensaje();
        }
        if(datosActualizarTopicoDTO.status() != null){
            this.status = Status.valueOf(datosActualizarTopicoDTO.status());
        }
    }

    public Topico(Long id, String titulo, String mensaje, LocalDate fecha_creacion, Status status, Usuario usuario, Curso curso) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fecha_creacion = fecha_creacion;
        this.status = status;
        this.usuario = usuario;
        this.curso = curso;
    }

    public Topico(){

    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public Status getStatus() {
        return status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Curso getCurso() {
        return curso;
    }
}
