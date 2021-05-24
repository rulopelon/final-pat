package aplicacion.despaching.modelos;



import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data	
@Table("profesores")
public class Profesor{
	@Id
	private String id;
	private String nombre;
	private String correo;
	private String rol;
	private String apellido;
	
	/*
	@MappedCollection(idColumn = "idAlumno")
	private Set<Alumno> alumnos = new HashSet<>();

	public void addAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	*/
}
