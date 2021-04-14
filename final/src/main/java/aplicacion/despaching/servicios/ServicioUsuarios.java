package aplicacion.despaching.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicacion.despaching.modelos.Usuario;
import aplicacion.despaching.repositorios.RepositorioUsuarios;

@Service
public class ServicioUsuarios {
	@Autowired
	RepositorioUsuarios repositorioUsuarios;
	public void borrarUsuarioById(String id) {
		Usuario usuarioBorrar = repositorioUsuarios.cargarUsuarioById(id);
		repositorioUsuarios.delete(usuarioBorrar);
	}
	public void borrarUsuario(Usuario user) {
		repositorioUsuarios.delete(user);
	}
	public void addUsuario(Usuario usuario) {
		repositorioUsuarios.save(usuario);
	}
}	
