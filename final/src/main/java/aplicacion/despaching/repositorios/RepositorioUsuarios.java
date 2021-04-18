  
package aplicacion.despaching.repositorios;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import aplicacion.despaching.modelos.Usuario;

public interface RepositorioUsuarios extends CrudRepository<Usuario,String>{
	@Query("SELECT email FROM usuarios WHERE id=:usuario")
	  public String cargarEmail(@Param("usuario") String usuario);
	
	@Query("SELECT * FROM Usuarios WHERE id=:id")
	 public Usuario cargarUsuarioById(@Param("id") String id);
	
	@Query("SELECT * FROM Usuarios WHERE id=:id and contrasena=:contrasena")
	 public Usuario cargarUsuarioByIdPass(@Param("id") String id,@Param("contrasena") String contrasena);
}