package aplicacion.despaching.servicios;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import aplicacion.despaching.modelos.Usuario;
import aplicacion.despaching.repositorios.RepositorioUsuarios;

@Service
public class ServicioLogIn {
	@Autowired
	ServicioEmail servicioEmail;
	@Autowired
	RepositorioUsuarios repositorioUsuarios;
	@Value("${dirEmail}")
	private String direccionEmail;
	 
	public Usuario logIn(String user, String passwd){
		return null;
		
	}
	public boolean recuperarPasswd(String usuario){
		boolean respuesta = false;
		
		final String contenido = "Su nueva contraseña es: "+generarContrasena();
		final String destinatario = repositorioUsuarios.cargarEmail(usuario);
		if(destinatario!= null){
			respuesta = true;
			final  String asunto = "Recuperacion Contraseña";
			servicioEmail.enviarEmail(destinatario,direccionEmail,asunto,contenido);
		}else {
			respuesta = false;
		}

		return respuesta;
	}
	
	private static String generarContrasena() {
	    int leftLimit = 48; // numeral '0'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	
	    String contrasenaNueva = random.ints(leftLimit, rightLimit + 1)
	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	
	   return contrasenaNueva;
	}
	
}
