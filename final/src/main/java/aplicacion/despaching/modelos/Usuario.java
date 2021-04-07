package aplicacion.despaching.modelos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"correo",
"id",
"nombre",
"apellido"
})
@Generated("jsonschema2pojo")
public class Usuario {

@JsonProperty("correo")
private String correo;
@JsonProperty("id")
private String id;
@JsonProperty("nombre")
private String nombre;
@JsonProperty("apellido")
private String apellido;

public Usuario(String correo) {
    this.setCorreo(correo);
}

public Usuario(String correo, String nombre, String apellido, String id) {
    this(correo);
    this.setNombre(nombre);
    this.setApellido(apellido);
    this.setId(id);
}

public Usuario(String nombre, String apellido, String id) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.id = id;
}

@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("correo")
public String getCorreo() {
return correo;
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
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
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
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
result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
result = ((result* 31)+((this.nombre == null)? 0 :this.nombre.hashCode()));
result = ((result* 31)+((this.correo == null)? 0 :this.correo.hashCode()));
result = ((result* 31)+((this.apellido == null)? 0 :this.apellido.hashCode()));
return result;
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Usuario) == false) {
return false;
}
Usuario rhs = ((Usuario) other);
return ((((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nombre == rhs.nombre)||((this.nombre!= null)&&this.nombre.equals(rhs.nombre))))&&((this.correo == rhs.correo)||((this.correo!= null)&&this.correo.equals(rhs.correo))))&&((this.apellido == rhs.apellido)||((this.apellido!= null)&&this.apellido.equals(rhs.apellido))));
}

}