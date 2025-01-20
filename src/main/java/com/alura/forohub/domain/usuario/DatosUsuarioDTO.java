package com.alura.forohub.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DatosUsuarioDTO(
        @NotBlank
        String nombre
) {
}
