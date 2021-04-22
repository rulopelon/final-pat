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
	
	@PostMapping("/realizar")
	public void realizarReserva(@RequestBody Reserva reserva) {
		servicioReservas.crearReserva(reserva);
	}
	@GetMapping("/getReservasProfesor")
	public ResponseEntity<List<Reserva>> getProfesores(@RequestParam("id") String id) {
		List<Reserva> reservas = servicioReservas.cargarReservasProfesor(id);
		return new ResponseEntity<List<Reserva>>(reservas,HttpStatus.OK);
	}
}
