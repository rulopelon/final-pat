package aplicacion.despaching.modelos;


import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"nombre",
"apellido",
"correo",
"contrasena",
"rol"
})
@Generated("jsonschema2pojo")
@Table("usuarios")
public class Usuario {

@JsonProperty("id")
@Id
private String id;
@JsonProperty("nombre")
private String nombre;
@JsonProperty("apellido")
private String apellido;
@JsonProperty("correo")
private String correo;
@JsonProperty("contrasena")
private String contrasena;
@JsonProperty("rol")
private String rol;


@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("nombre")
public String getNombre() {
return nombre;
}

@JsonProperty("nombre")
public void setNombre(String nombre) {
this.nombre = nombre;
}

@JsonProperty("apellido")
public String getApellido() {
return apellido;
}

@JsonProperty("apellido")
public void setApellido(String apellido) {
this.apellido = apellido;
}

@JsonProperty("correo")
public String getCorreo() {
return correo;
}

@JsonProperty("correo")
public void setCorreo(String correo) {
this.correo = correo;
}

@JsonProperty("contrasena")
public String getContrasena() {
return contrasena;
}

@JsonProperty("contrasena")
public void setContrasena(String contrasena) {
this.contrasena = contrasena;
}

@JsonProperty("rol")
public String getRol() {
return rol;
}

@JsonProperty("rol")
public void setRol(String rol) {
this.rol = rol;
}





}