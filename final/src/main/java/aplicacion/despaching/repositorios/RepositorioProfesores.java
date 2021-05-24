package aplicacion.despaching.repositorios;




import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import aplicacion.despaching.modelos.Profesor;


	public interface RepositorioProfesores extends CrudRepository<Profesor,String>{
	@Query("INSERT INTO profesores (id,nombre, apellido,correo,rol) VALUES(:id,:nombre,:apellido,:correo,:rol)")
	public void addProfesor(@Param("id")String id,@Param("nombre")String nombre,@Param("apellido")String apellido,@Param("correo")String correo,@Param("rol")String rol);
}
