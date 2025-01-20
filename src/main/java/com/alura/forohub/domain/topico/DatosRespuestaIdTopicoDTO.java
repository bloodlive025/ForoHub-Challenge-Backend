package com.alura.forohub.domain.topico;

public record DatosRespuestaIdTopicoDTO(
        String titulo,
        String mensaje,
        String fecha_creacion,
        String status
) {
  public DatosRespuestaIdTopicoDTO(Topico topico){
    this(topico.getTitulo() , topico.getMensaje() , topico.getFecha_creacion().toString() , topico.getStatus().toString());
  }
}
