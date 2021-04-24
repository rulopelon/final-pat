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
	public void crearReserva(Reserva reserva){
		repositorioReservas.save(reserva);
		
	}
	public void borrar(Reserva reserva){
		repositorioReservas.delete(reserva);
		
	}
	public ArrayList<Reserva> cargarReservasProfesor(String idProfesor){
		List<Reserva> reservas = repositorioReservas.getReservasProfesorById(idProfesor);
		ArrayList<Reserva> arrayReservas = new ArrayList<Reserva>(reservas);
		return arrayReservas;
	}
	public ArrayList<Reserva> cargarReservasAlumno(String idAlumno){
		List<Reserva> reservas = repositorioReservas.getReservasAlumnoById(idAlumno);
		ArrayList<Reserva> arrayReservas = new ArrayList<Reserva>(reservas);
		return arrayReservas;
	}
	public ArrayList<Reserva> cargarReservasProfesor(Profesor profesor){
		List<Reserva> reservas = repositorioReservas.getReservasProfesorById(profesor.getId());
		ArrayList<Reserva> arrayReservas = new ArrayList<Reserva>(reservas);
		return arrayReservas;
	}
	public ArrayList<Reserva> cargarReservasAlumno(Alumno alumno){
		List<Reserva> reservas = repositorioReservas.getReservasAlumnoById(alumno.getIdAlumno());
		ArrayList<Reserva> arrayReservas = new ArrayList<Reserva>(reservas);
		return arrayReservas;
	}
	public Reserva getReservaById(String id){
		
		return repositorioReservas.getReservasByid(id);
	}
	
}
