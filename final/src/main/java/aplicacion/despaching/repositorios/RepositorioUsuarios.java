  
package aplicacion.despaching.repositorios;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import aplicacion.despaching.modelos.Alumno;
import aplicacion.despaching.modelos.Profesor;
import aplicacion.despaching.modelos.Usuario;

public interface RepositorioUsuarios extends CrudRepository<Usuario,String>{
	@Query("SELECT correo FROM usuarios WHERE id=:usuario")
	  public String cargarEmail(@Param("usuario") String usuario);
	
	@Query("SELECT * FROM usuarios WHERE id=:id")
	 public Usuario cargarUsuarioById(@Param("id") String id);
	
	@Query("SELECT * FROM usuarios WHERE nombre=:nombre and contrasena=:contrasena")
	 public Usuario cargarUsuarioByIdPass(@Param("nombre") String nombre,@Param("contrasena") String contrasena);
	@Modifying
	@Query("UPDATE Usuarios SET contrasena = :contrasena WHERE id=:id ")
	 public void updateContrasena(@Param("id") String id,@Param("contrasena") String contrasena);
	@Query("SELECT * FROM profesores WHERE id=:id")
	 public Profesor getProfesorById(@Param("id") String id);
	@Query("SELECT * FROM alumnos WHERE idAlumno=:id")
	 public Alumno getAlumnoById(@Param("id") String id);
	@Query("SELECT p.id FROM alumnos a, profesores p, alumnos_profesores u WHERE a.idAlumno=u.idAlumno and u.idProfesor= p.id and a.idAlumno=:id")
	 public List<String> getProfesoresAlumno(@Param("id") String id);
	@Query("SELECT a.idAlumno FROM alumnos a, profesores p, alumnos_profesores u WHERE a.idAlumno=u.idAlumno and u.idProfesor= p.id and p.id=:id")
	 public List<String> getAlumnosProfesor(@Param("id") String id);
	
	
}