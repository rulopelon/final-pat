package aplicacion.despaching.repositorios;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import aplicacion.despaching.modelos.Alumno;
import aplicacion.despaching.modelos.Profesor;
import aplicacion.despaching.modelos.Reserva;
import aplicacion.despaching.modelos.Usuario;

public interface RepositorioReservas extends CrudRepository<Reserva,String>{
	@Query("SELECT r.idreserva FROM reservas r, reservas_profesores p WHERE r.idreserva = p.idreserva and p.idprofesor= :id")
	List<String> getReservasProfesorById(@Param("id") String id);
	
	@Query("SELECT r.idreserva FROM reservas r, alumnos_reservas a WHERE r.idreserva = a.idreserva and a.idalumno= :id")
	List<String> getReservasAlumnoById(@Param("id") String id);
	
	@Query("SELECT a.idalumno FROM alumnos a,alumnos_reservas u WHERE a.idalumno=u.idalumno and u.idreserva= :id")
	List<String>getAlumnosReserva(@Param("id") String id);
	
	@Query("SELECT p.id FROM reservas_profesores r, profesores p WHERE p.id=u.idprofesor and u.idreserva=:id")
	Profesor getProfesorReserva(@Param("id") String id);
	
	@Query("SELECT r.idreserva FROM alumnos a,alumnos_reservas u,reservas r WHERE a.idalumno=u.idalumno and r.idreserva=u.idreserva and u.idreserva= :id")
	List<String> getReservasAlumno(@Param("id") String id);
	
	@Query("SELECT r.idreserva FROM profesores p,reservas_profesores u,reservas r WHERE p.id=u.idprofesor and r.idreserva=u.idreserva and u.idreserva= :id")
	List<String> getReservasProfesor(@Param("id") String id);
	
	@Query("SELECT * FROM reservas WHERE idreserva = :id")
	Reserva getReservasByid(@Param("id") String reserva);
	@Transactional
	@Query("INSERT INTO reservas_profesores (idreserva,idprofesor) VALUES (:idReserva,:idProfesor)")
	public void addProfesorReserva(@Param("idReserva") String idReserva,@Param("idProfesor")String idProfesor);
	
	@Transactional
	@Query("INSERT INTO alumnos_reservas (idreserva,idprofesor) VALUES (:idReserva,:idAlumno)")
	public void addAlumnoReserva(@Param("idReserva") String idReserva,@Param("idAlumno")String idAlumno);
	
	@Transactional
	@Query("INSERT INTO reservas (idreserva,mes,ano,dia,minuto,hora) VALUES (:idreserva,:mes,:ano,:dia,:minuto,:hora)")
	public void addReserva(@Param("idreserva") String idReserva,@Param("mes")int i,@Param("ano")int j,@Param("dia")int k,@Param("minuto")int l,@Param("hora")int m);
}
