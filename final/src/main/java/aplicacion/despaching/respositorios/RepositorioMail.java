package aplicacion.despaching.respositorios;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RepositorioMail extends CrudRepository<String,String>{

		@Query("select email from usuarios where id=:usuario")
		  public String cargarEmail(@Param("usuario") String usuario);
}
