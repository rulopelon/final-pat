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
"usuario",
"passwd"
})
@Generated("jsonschema2pojo")
public class UsuarioEntrada {

@JsonProperty("usuario")
private String usuario;
@JsonProperty("passwd")
private String passwd;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("usuario")
public String getUsuario() {
return usuario;
}

@JsonProperty("usuario")
public void setUsuario(String usuario) {
this.usuario = usuario;
}

@JsonProperty("passwd")
public String getPasswd() {
return passwd;
}

@JsonProperty("passwd")
public void setPasswd(String passwd) {
this.passwd = passwd;
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
sb.append(UsuarioEntrada.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("usuario");
sb.append('=');
sb.append(((this.usuario == null)?"<null>":this.usuario));
sb.append(',');
sb.append("passwd");
sb.append('=');
sb.append(((this.passwd == null)?"<null>":this.passwd));
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
result = ((result* 31)+((this.usuario == null)? 0 :this.usuario.hashCode()));
result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
result = ((result* 31)+((this.passwd == null)? 0 :this.passwd.hashCode()));
return result;
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof UsuarioEntrada) == false) {
return false;
}
UsuarioEntrada rhs = ((UsuarioEntrada) other);
return ((((this.usuario == rhs.usuario)||((this.usuario!= null)&&this.usuario.equals(rhs.usuario)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.passwd == rhs.passwd)||((this.passwd!= null)&&this.passwd.equals(rhs.passwd))));
}

}