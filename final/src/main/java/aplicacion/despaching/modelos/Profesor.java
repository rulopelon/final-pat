package aplicacion.despaching.modelos;


import java.util.HashSet;
import java.util.Set;

import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("Profesores")
public class Profesor extends Usuario{
		
	
	public Profesor(String correo, String nombre, String apellido, String id, String rol) {
		super(correo, nombre, apellido, id, rol);
		// TODO Auto-generated constructor stub
	}

	public Profesor(String nombre, String apellido, String id) {
		super(nombre, apellido, id);
		// TODO Auto-generated constructor stub
	}

	public Profesor(String correo) {
		super(correo);
		// TODO Auto-generated constructor stub
	}
	@MappedCollection(idColumn = "idAlumno")
	private Set<Alumno> alumnos = new HashSet<>();

	public void addAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	
}
