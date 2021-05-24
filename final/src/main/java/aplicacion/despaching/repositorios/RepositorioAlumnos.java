package aplicacion.despaching.repositorios;



import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import aplicacion.despaching.modelos.Alumno;


	public interface RepositorioAlumnos extends CrudRepository<Alumno,String>{
		@Transactional
		@Modifying
		@Query("INSERT INTO alumnos_profesores (idAlumno,idProfesor) VALUES (:idAlumno,:idProfesor)")
		public void addAlumnosProfesor(@Param("idAlumno") String idAlumno,@Param("idProfesor") String idProfesor);
		@Transactional
		@Modifying
		@Query("INSERT INTO alumnos (idAlumno,nombre, apellido,correo) VALUES(:id,:nombre,:apellido,:correo)")
		public void addAlumno(@Param("id")String id,@Param("nombre")String nombre,@Param("apellido")String apellido,@Param("correo")String correo);
}
