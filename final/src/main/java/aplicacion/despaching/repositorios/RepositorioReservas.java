package aplicacion.despaching.repositorios;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import aplicacion.despaching.modelos.Alumno;
import aplicacion.despaching.modelos.Profesor;
import aplicacion.despaching.modelos.Reserva;
import aplicacion.despaching.modelos.Usuario;

public interface RepositorioReservas extends CrudRepository<Reserva,Usuario>{
	@Query("SELECT * FROM reservas WHERE idProfesor= :id")
	List<Reserva> getReservasProfesorById(@Param("id") String id);
	
	@Query("SELECT * FROM reservas WHERE idAlumno= :id")
	List<Reserva> getReservasAlumnoById(@Param("id") String id);
	
	@Query("SELECT a.idAlumno FROM alumnos a,alumnos_reservas u WHERE a.idAlumno=u.idAlumno and u.idReserva= :id")
	List<String>getAlumnosReserva(@Param("id") String id);
	
	@Query("SELECT p.id FROM reservas_profesores r, profesores p WHERE p.id=u.idProfesor and u.idReserva=:id")
	Profesor getProfesorReserva(@Param("id") String id);
	
	@Query("SELECT r.idReserva FROM alumnos a,alumnos_reservas u,reservas r WHERE a.idAlumno=u.idAlumno and r.idReserva=u.idReserva and u.idReserva= :id")
	List<String> getReservasAlumno(@Param("id") String id);
	
	@Query("SELECT r.idReserva FROM profesores p,reservas_profesores u,reservas r WHERE p.id=u.idProfesor and r.idReserva=u.idReserva and u.idReserva= :id")
	List<String> getReservasProfesor(@Param("id") String id);
	
	@Query("SELECT * FROM reservas WHERE idReserva = :id")
	Reserva getReservasByid(@Param("id") String reserva);
}
