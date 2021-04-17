package aplicacion.despaching.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Alumnos")

public class Alumno extends Usuario{
	@Id
	@Column("idAlumno")
	String idAlumno;

	public Alumno(String correo, String nombre, String apellido, String id, String rol) {
		super(correo, nombre, apellido, id, rol);
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, String id) {
		super(nombre, apellido, id);
		// TODO Auto-generated constructor stub
	}

	public Alumno(String correo) {
		super(correo);
		// TODO Auto-generated constructor stub
	}
	
	


}
