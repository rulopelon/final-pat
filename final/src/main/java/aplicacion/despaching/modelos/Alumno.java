package aplicacion.despaching.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;



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
"idAlumno",
"nombre",
"apellido",
"correo"
})
@Generated("jsonschema2pojo")
@Table("alumnos")
public class Alumno {
	

@JsonProperty("idAlumno")
@Id
@Column("idalumno")
private String idalumno;
@JsonProperty("nombre")
private String nombre;
@JsonProperty("apellido")
private String apellido;
@JsonProperty("correo")
private String correo;


@JsonProperty("idAlumno")
public String getIdAlumno() {
return idalumno;
}

@JsonProperty("idAlumno")
public void setIdAlumno(String idAlumno) {
this.idalumno = idAlumno;
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



}
