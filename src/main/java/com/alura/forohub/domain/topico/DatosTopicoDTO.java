package com.alura.forohub.domain.topico;
import com.alura.forohub.domain.curso.DatosCursoDTO;
import com.alura.forohub.domain.usuario.DatosUsuarioDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosTopicoDTO(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fecha_creacion,
        @NotBlank
        String status,
        @NotNull
        DatosUsuarioDTO usuario,
        @NotNull
        DatosCursoDTO curso
) {
}
