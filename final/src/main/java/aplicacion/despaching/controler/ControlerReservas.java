package aplicacion.despaching.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aplicacion.despaching.modelos.Reserva;
import aplicacion.despaching.servicios.ServicioReservas;

@RestController
@RequestMapping("/reservas")
public class ControlerReservas {
	@Autowired
	ServicioReservas servicioReservas;
	
	@PostMapping("/realizarReserva")
	public void realizarReserva(@RequestBody Reserva reserva) {
		servicioReservas.crearReserva(reserva);
	}
	@GetMapping("/getReservasProfesor")
	public ResponseEntity<List<Reserva>> getReservasProfesor(@RequestParam("id") String id) {
		List<Reserva> reservas = servicioReservas.cargarReservasProfesor(id);
		return new ResponseEntity<List<Reserva>>(reservas,HttpStatus.OK);
	}
	@GetMapping("/getReservasAlumno")
	public ResponseEntity<List<Reserva>> getReservasAlumno(@RequestParam("id") String id) {
		List<Reserva> reservas = servicioReservas.cargarReservasAlumno(id);
		return new ResponseEntity<List<Reserva>>(reservas,HttpStatus.OK);
	}
	@GetMapping("/getReserva")
	public ResponseEntity<Reserva> getReserva(@RequestParam("id") String id) {
		Reserva reserva = servicioReservas.getReservaById(id);
		return new ResponseEntity<Reserva>(reserva,HttpStatus.OK);
	}
	@GetMapping("/deleteReserva")
	public void deleteReserva(@RequestParam("id") Reserva reserva) {
		servicioReservas.borrar(reserva);
	}
	
}
