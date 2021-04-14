package aplicacion.despaching.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aplicacion.despaching.modelos.Usuario;
import aplicacion.despaching.servicios.ServicioUsuarios;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsuarios {
	@Autowired
	ServicioUsuarios servicioUsuarios;
	@PostMapping("/delete")
	public void borrarUsuario(@RequestBody Usuario user) {
		servicioUsuarios.borrarUsuario(user);
	}
	@PostMapping("/add")
	public void addUsuario(@RequestBody Usuario user) {
		servicioUsuarios.addUsuario(user);
	}
	@GetMapping("/delete/{id}")
	public void addUsuario(@PathVariable("id") String id) {
		servicioUsuarios.borrarUsuarioById(id);
	}

}
