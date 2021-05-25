package aplicacion.despaching.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicacion.despaching.modelos.Alumno;
import aplicacion.despaching.modelos.Profesor;
import aplicacion.despaching.modelos.Reserva;
import aplicacion.despaching.repositorios.RepositorioReservas;

@Service
public class ServicioReservas {
	@Autowired
	RepositorioReservas repositorioReservas;
	public void crearReserva(Reserva reserva, String idAlumno,String idProfesor){
		System.out.println(reserva.getIdReserva());
		repositorioReservas.addReserva(reserva.getIdReserva(),reserva.getMes(),reserva.getAno(),reserva.getDia(),reserva.getMinuto(),reserva.getHora());
		repositorioReservas.addAlumnoReserva(reserva.getIdReserva(),  idAlumno);
		repositorioReservas.addProfesorReserva(reserva.getIdReserva(),  idProfesor);
		
	}
	public void borrar(String id){
		Reserva reserva =repositorioReservas.getReservasByid(id);
		repositorioReservas.delete(reserva);
		
	}
	public ArrayList<Reserva> cargarReservasProfesor(String idProfesor){
		ArrayList<Reserva> respuesta = new ArrayList<Reserva>();
		List<String> reservas = repositorioReservas.getReservasProfesorById(idProfesor);
		for(String reserva:reservas) {
			Reserva reservaCargada = repositorioReservas.getReservasByid(reserva);
			respuesta.add(reservaCargada);
		}
		return respuesta;
	}
	public ArrayList<Reserva> cargarReservasAlumno(String idAlumno){
		ArrayList<Reserva> respuesta = new ArrayList<Reserva>();
		List<String> reservas = repositorioReservas.getReservasAlumnoById(idAlumno);
		for(String reserva:reservas) {
			Reserva reservaCargada = repositorioReservas.getReservasByid(reserva);
			respuesta.add(reservaCargada);
		}
		return respuesta;
	}
	
	public Reserva getReservaById(String id){
		
		return repositorioReservas.getReservasByid(id);
	}
	public void addAlumnoReserva(Alumno alumno,String idReserva){
		repositorioReservas.addAlumnoReserva(idReserva, alumno.getIdAlumno());
		
	}
	
}
