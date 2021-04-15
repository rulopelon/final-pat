package aplicacion.despaching.modelos;



public class Profesor extends Usuario{

	public Profesor(String correo, String nombre, String apellido, String id, String rol) {
		super(correo, nombre, apellido, id, rol);
		// TODO Auto-generated constructor stub
	}

	public Profesor(String nombre, String apellido, String id) {
		super(nombre, apellido, id);
		// TODO Auto-generated constructor stub
	}

	public Profesor(String correo) {
		super(correo);
		// TODO Auto-generated constructor stub
	}


}
