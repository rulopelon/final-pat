package aplicacion.despaching.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicacion.despaching.modelos.Alumno;
import aplicacion.despaching.modelos.Profesor;
import aplicacion.despaching.modelos.Reserva;
import aplicacion.despaching.modelos.Usuario;
import aplicacion.despaching.repositorios.RepositorioAlumnos;
import aplicacion.despaching.repositorios.RepositorioProfesores;
import aplicacion.despaching.repositorios.RepositorioReservas;
import aplicacion.despaching.repositorios.RepositorioUsuarios;

@Service
public class ServicioUsuarios {
	@Autowired
	RepositorioUsuarios repositorioUsuarios;
	@Autowired
	RepositorioReservas repositorioReservas;
	@Autowired
	RepositorioAlumnos repositorioAlumnos;
	@Autowired
	RepositorioProfesores repositorioProfesores;
	
	public void borrarUsuarioById(String id) {
		Usuario usuarioBorrar = repositorioUsuarios.cargarUsuarioById(id);
		repositorioUsuarios.delete(usuarioBorrar);
	}
	public void borrarUsuario(Usuario user) {
		repositorioUsuarios.delete(user);
	}
	public void addUsuario(Usuario usuario) {
		repositorioUsuarios.addUsuario(usuario.getId(),usuario.getNombre(),usuario.getApellido(), usuario.getCorreo(), usuario.getRol(),usuario.getContrasena());
	}
	public ArrayList<Profesor> getProfesoresAlumno(String id){
		ArrayList<Profesor> respuesta = new ArrayList<Profesor>();
		List<String> idProfesores =repositorioUsuarios.getProfesoresAlumno(id);
		for(String idProfesor:idProfesores) {
			respuesta.add(repositorioUsuarios.getProfesorById(idProfesor));
		}
		return respuesta;
	}
	public ArrayList<Alumno> getAlumnosProfesor(String id){
		ArrayList<Alumno> respuesta = new ArrayList<Alumno>();
		List<String> idAlumnos =repositorioUsuarios.getAlumnosProfesor(id);
		for(String idAlumno:idAlumnos) {
			respuesta.add(repositorioUsuarios.getAlumnoById(idAlumno));
		}
		return respuesta;
	}
	public ArrayList<Reserva> getReservasAlumno(String idReserva){
		ArrayList<Reserva> respuesta = new ArrayList<Reserva>();
		List<String> idReservaList = repositorioReservas.getReservasAlumno(idReserva);
		for(String reserva:idReservaList) {
			Reserva reservaCargada =repositorioReservas.getReservasByid(reserva);
			respuesta.add(reservaCargada);
		}
		return respuesta;
	}
	public ArrayList<Reserva> getReservasProfesor(String idReserva){
		ArrayList<Reserva> respuesta = new ArrayList<Reserva>();
		List<String> idReservaList = repositorioReservas.getReservasProfesor(idReserva);
		for(String reserva:idReservaList) {
			Reserva reservaCargada =repositorioReservas.getReservasByid(reserva);
			respuesta.add(reservaCargada);
		}
		return respuesta;
	}
	public Usuario getUsuario(String id){
		return repositorioUsuarios.cargarUsuarioById(id);
		
	}
	public void addAlumno(Alumno alumno, String profesor) {
		repositorioAlumnos.addAlumno(alumno.getIdAlumno(),alumno.getNombre(),alumno.getApellido(),alumno.getCorreo());
		repositorioAlumnos.addAlumnosProfesor(alumno.getIdAlumno(), profesor);
	}
	public void addAlumnoProfesor(Alumno alumno, String profesor) {
		repositorioAlumnos.addAlumnosProfesor(alumno.getIdAlumno(), profesor);;
	}
	public void addProfesor(Profesor profesor) {
		repositorioProfesores.addProfesor(profesor.getId(),profesor.getNombre(),profesor.getApellido(), profesor.getCorreo(), profesor.getRol());
	}
	
}	
