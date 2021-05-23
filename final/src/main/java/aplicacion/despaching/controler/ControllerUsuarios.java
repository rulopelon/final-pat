package aplicacion.despaching.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aplicacion.despaching.modelos.Alumno;
import aplicacion.despaching.modelos.Profesor;
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
		return new ResponseEntity<String>("Todo correcto",HttpStatus.OK);
	}
	@PostMapping("/addUsuario")
	public ResponseEntity<String> addUsuario(@RequestBody Usuario user) {
		servicioUsuarios.addUsuario(user);
		return new ResponseEntity<String>("Todo correcto",HttpStatus.OK);

	}
	@PostMapping("/addProfesor")
	public ResponseEntity<String> addProfesor(@RequestBody Profesor profesor) {
		servicioUsuarios.addProfesor(profesor);
		return new ResponseEntity<String>("Todo correcto",HttpStatus.OK);

	}
	@PostMapping("/addAlumnoProfesor/{idProfesor}")
	public ResponseEntity<String> addAlumnoProfesor(@RequestBody Alumno alumno,@PathVariable(value="idProfesor") String idProfesor) {
		servicioUsuarios.addAlumnoProfesor(alumno,idProfesor);
		return new ResponseEntity<String>("Todo correcto",HttpStatus.OK);

	}
	@PostMapping("/addAlumno")
	public ResponseEntity<String> addAlumno(@RequestBody Alumno alumno,@RequestBody Profesor profesor) {
		servicioUsuarios.addAlumno(alumno,profesor);
		return new ResponseEntity<String>("Todo correcto",HttpStatus.OK);

	}
	@GetMapping("/getProfesores")
	public ResponseEntity<List<Profesor>> getProfesoresAlumno(@RequestParam("id") String id) {
		List<Profesor> profesores =servicioUsuarios.getProfesoresAlumno(id);
		return new ResponseEntity<List<Profesor>>(profesores,HttpStatus.OK);
	}
	@GetMapping("/getAlumnos")
	public ResponseEntity<List<Alumno>> getAlumnosProfesor(@RequestParam("id") String id) {
		List<Alumno> alumnos =servicioUsuarios.getAlumnosProfesor(id);
		return new ResponseEntity<List<Alumno>>(alumnos,HttpStatus.OK);
	}
	

}
