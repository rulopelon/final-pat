package aplicacion.despaching.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicacion.despaching.modelos.Usuario;
import aplicacion.despaching.repositorios.RepositorioUsuarios;

@Service
public class ServicioUsuarios {
	@Autowired
	RepositorioUsuarios repositorioUsuarios;
	public void borrarUsuario(String id) {
		Usuario usuarioBorrar = repositorioUsuarios.cargarUsuarioById(id);
		repositorioUsuarios.delete(usuarioBorrar);
	}
	public void addUsuario(Usuario usuario) {
		repositorioUsuarios.save(usuario);
	}
}	
