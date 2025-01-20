package com.alura.forohub.domain.curso;

import jakarta.persistence.*;
import lombok.*;


@Entity(name = "Curso")
@Table(name = "cursos")

@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Curso(DatosCursoDTO curso) {
        this.nombre = curso.nombre();
        this.categoria = Categoria.valueOf(curso.categoria());
    }

    public Curso(){

    }

    public Curso(long id, String nombre, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
