package com.alura.forohub.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroUsuariosDTO(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String correo_electronico,
        @NotBlank
        String contrasena
) {
}
