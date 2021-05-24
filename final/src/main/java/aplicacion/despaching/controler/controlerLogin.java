package aplicacion.despaching.controler;

import javax.validation.Valid;

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
import aplicacion.despaching.modelos.UsuarioEntrada;
import aplicacion.despaching.servicios.ServicioLogIn;

@RestController
@RequestMapping("/login")
public class controlerLogin {
	@Autowired
	ServicioLogIn servicioLogin;
	@PostMapping("/log")
	public ResponseEntity logIn(@RequestBody @Valid UsuarioEntrada usuario){
		ResponseEntity respuesta;
		Usuario usuarioRespuesta = servicioLogin.logIn(usuario.getUsuario(), usuario.getPasswd());
		if(usuarioRespuesta != null){
			respuesta = new ResponseEntity<Usuario>(usuarioRespuesta,HttpStatus.OK);
			
		}else {
			respuesta = new ResponseEntity<String>("Contraseña o usuario incorrectos",HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return respuesta;
	}
	@GetMapping("/recuperar")
	public ResponseEntity<String> recuperarPasswd(@RequestParam("userId") String idUsuario){
		ResponseEntity<String> respuesta;
		if(servicioLogin.recuperarPasswd(idUsuario)){
			respuesta = new ResponseEntity<String>("Todo ok",HttpStatus.OK);
			
		}else {
			respuesta = new ResponseEntity<String>("No existe el usuario",HttpStatus.NOT_ACCEPTABLE);

		}
		return respuesta;
	}
}
	

