package aplicacion.despaching.repositorios;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import aplicacion.despaching.modelos.Reserva;
import aplicacion.despaching.modelos.Usuario;

public interface RepositorioReservas extends CrudRepository<Reserva,Usuario>{
	@Query("SELECT * FROM \"Reservas\" WHERE idProfesor= :id")
	List<Reserva> getReservasProfesorById(@Param("id") String id);
	
	@Query("SELECT * FROM \"Reservas\" WHERE idAlumno= :id")
	List<Reserva> getReservasAlumnoById(@Param("id") String id);
	
}
