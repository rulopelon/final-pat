package aplicacion.despaching.controler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErroresController extends ResponseEntityExceptionHandler {
		// es un manejador de excepcilnes generico
		@ExceptionHandler(Exception.class)
		public ResponseEntity<String> ExcepcionHandler(Exception e) {
			return new ResponseEntity<String>("Se ha producido un error ",HttpStatus.INTERNAL_SERVER_ERROR);
			
		}

	}

