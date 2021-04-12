package aplicacion.despaching.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("Reservas")
public class Reserva {
	@Id
	@Column("idProfesor")
	private String clave;
	private  int dia;
	private  int mes;
	private  int ano;
	private  int hora;
	private  int minuto;
}
