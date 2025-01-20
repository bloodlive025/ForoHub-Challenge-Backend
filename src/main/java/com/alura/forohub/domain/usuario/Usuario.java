package com.alura.forohub.domain.usuario;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity(name = "Usuario")
@Table(name = "usuarios")
@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class Usuario implements UserDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String correo_electronico;
  private String contrasena;

  public Usuario(DatosRegistroUsuariosDTO datosRegistroUsuariosDTO) {
    this.nombre = datosRegistroUsuariosDTO.nombre();
    this.correo_electronico = datosRegistroUsuariosDTO.correo_electronico();
    this.contrasena = datosRegistroUsuariosDTO.contrasena();
  }

  public Usuario(DatosUsuarioDTO datosUsuarioDTO) {
    this.nombre = datosUsuarioDTO.nombre();
  }

  public Usuario(Long id, String nombre, String correo_electronico, String contrasena) {
    this.id = id;
    this.nombre = nombre;
    this.correo_electronico = correo_electronico;
    this.contrasena = contrasena;
  }

  public Usuario(){}

  public Long getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCorreo_electronico() {
    return correo_electronico;
  }

  public String getContrasena() {
    return contrasena;
  }

  //Seguridad
  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return List.of(new SimpleGrantedAuthority("ROLE_USER"));
  }

  @Override
  public String getPassword() {
    return contrasena;
  }

  @Override
  public String getUsername() {
    return nombre;
  }

  @Override
  public boolean isAccountNonExpired(){
    return  true;
  }

  @Override
  public boolean isCredentialsNonExpired(){
    return true;
  }

  @Override
  public boolean isEnabled(){
    return true;
  }

}
