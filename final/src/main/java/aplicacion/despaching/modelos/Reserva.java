package aplicacion.despaching.modelos;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("reservas")
public class Reserva {
	@Id
	@Column("idReserva")
	private int idReserva;
	private  int dia;
	private  int mes;
	private  int ano;
	private  int hora;
	private  int minuto;
	@MappedCollection(idColumn = "idAlumno")
	private Set<Alumno> alumnos = new HashSet<>();
	
	@MappedCollection(idColumn = "id")
	private Set<Profesor> profesores = new HashSet<>();

	public void addAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	public void addProfesor(Profesor profesor) {
		profesores.add(profesor);
	}
}
