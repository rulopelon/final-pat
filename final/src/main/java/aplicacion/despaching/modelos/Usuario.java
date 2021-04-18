package aplicacion.despaching.modelos;


import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.relational.core.mapping.Table;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"correo",
"id",
"contrasena",
"nombre",
"apellido",
"rol"
})
@Table("Usuarios")
@Generated("jsonschema2pojo")
public class Usuario {

@JsonProperty("correo")
private String correo;
@JsonProperty("contrasena")
private String contrasena;
@Id
@JsonProperty("id")
private String id;
@JsonProperty("nombre")
private String nombre;
@JsonProperty("apellido")
private String apellido;
@JsonProperty("rol")
private String rol;

public Usuario(String correo) {
    this.setCorreo(correo);
}

public Usuario(String correo, String nombre, String apellido, String id,String rol) {
    this(correo);
    this.setNombre(nombre);
    this.setApellido(apellido);
    this.setId(id);
    this.setRol(rol);
}
@PersistenceConstructor
public Usuario(String correo, String nombre, String apellido, String id,String rol, String contrasena) {
    this(correo);
    this.setNombre(nombre);
    this.setApellido(apellido);
    this.setId(id);
    this.setContrasena(contrasena);
    this.setRol(rol);
}

public Usuario(String nombre, String apellido, String id) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.id = id;
}



@JsonProperty("correo")
public String getCorreo() {
return correo;
}


@JsonProperty("contrasena")
public void setContrasena(String contrasena) {
this.contrasena = correo;
}
@JsonProperty("contrasena")
public String getContrasena() {
return contrasena;
}


@JsonProperty("correo")
public void setCorreo(String correo) {
this.correo = correo;
}

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
@JsonProperty("rol")
public String getRol() {
return rol;
}

@JsonProperty("rol")
public void setRol(String rol) {
this.rol = rol;
}





@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(Usuario.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("correo");
sb.append('=');
sb.append(((this.correo == null)?"<null>":this.correo));
sb.append(',');
sb.append("id");
sb.append('=');
sb.append(((this.id == null)?"<null>":this.id));
sb.append(',');
sb.append("nombre");
sb.append('=');
sb.append(((this.nombre == null)?"<null>":this.nombre));
sb.append(',');
sb.append("apellido");
sb.append('=');
sb.append(((this.apellido == null)?"<null>":this.apellido));
sb.append(',');
sb.append("rol");
sb.append('=');
sb.append(((this.rol == null)?"<null>":this.rol));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');


if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

@Override
public int hashCode() {
int result = 1;
result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
result = ((result* 31)+((this.nombre == null)? 0 :this.nombre.hashCode()));
result = ((result* 31)+((this.correo == null)? 0 :this.correo.hashCode()));
result = ((result* 31)+((this.apellido == null)? 0 :this.apellido.hashCode()));
result = ((result* 31)+((this.rol == null)? 0 :this.rol.hashCode()));
return result;
}



}