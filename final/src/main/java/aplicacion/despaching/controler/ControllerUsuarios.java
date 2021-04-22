package aplicacion.despaching.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aplicacion.despaching.modelos.Usuario;
import aplicacion.despaching.servicios.ServicioUsuarios;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsuarios {
	@Autowired
	ServicioUsuarios servicioUsuarios;
	@PostMapping("/delete")
	public ResponseEntity<String> borrarUsuario(@RequestBody Usuario user) {
		servicioUsuarios.borrarUsuario(user);
		return new ResponseEntity<String>("Todo correcto",HttpStatus.OK)

	}
	@PostMapping("/add")
	public ResponseEntity<String> addUsuario(@RequestBody Usuario user) {
		servicioUsuarios.addUsuario(user);
		return new ResponseEntity<String>("Todo correcto",HttpStatus.OK)

	}
	@GetMapping("/delete")
	public ResponseEntity<String> addUsuario(@RequestParam("id") String id) {
		servicioUsuarios.borrarUsuarioById(id);
		return new ResponseEntity<String>("Todo correcto",HttpStatus.OK)
	}
	

}
