package aplicacion.despaching.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Alumnos")

public class Alumno {
	@Id
	@Column("idAlumno")
	String idAlumno;
	
	private String nombre;
	private String apellidos;
	private String correo;
	public Alumno(String idAlumno, String nombre, String apellidos, String correo) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
	}
	public String getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(String idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	


}
