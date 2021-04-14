package aplicacion.despaching.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
public class ControlerReservas {
	@Autowired
	ServicioReservas servicioReservas;
	
	@PostMapping("/realizar")
	public void realizarReserva(@RequestBody Reserva reserva)
		servicioReservas.realizarReserva(reserva);
	
}
