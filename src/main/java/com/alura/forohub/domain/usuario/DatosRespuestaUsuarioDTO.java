package com.alura.forohub.domain.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRespuestaUsuarioDTO(
        @NotNull
        Long id,
        @NotBlank
        String nombre
) {
  public DatosRespuestaUsuarioDTO (Usuario usuario) {
   this(usuario.getId(), usuario.getNombre());
  }
}
