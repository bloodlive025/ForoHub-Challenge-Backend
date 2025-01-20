package com.alura.forohub.domain.curso;

import jakarta.persistence.*;
import lombok.*;


@Entity(name = "Curso")
@Table(name = "cursos")
@NoArgsConstructor
@AllArgsConstructor
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
}
