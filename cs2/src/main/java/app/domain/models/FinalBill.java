package app.domain.models;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class FinalBill extends Bill{
	private String idFactura;          
    private long idMascota;           
    private long idDueño;             
    private String idOrden2;           
    private String nombreProducto;     
    private double valor;              
    private int cantidad;             
    private String fecha2;
	public FinalBill(long cedula, String name, long edad, String userName, String password, long fecha,
			String medicoVeterinario, String motivoConsulta, String sintomatologia, String diagnostico,
			String procedimiento, String medicamento, String dosisMedicamento, long idOrden, String historialVacunacion,
			String alergiasMedicamentos, String detalleProcedimiento, boolean anulacion, String idOrdenn,
			long idMascota, long cedulaDueño, long cedulaVeterinario, String medicamento2, String dosis,
			String fechaGeneracion, String idFactura, long idMascota2, long idDueño, String idOrden2,
			String nombreProducto, double valor, int cantidad, String fecha2) {
		super(cedula, name, edad, userName, password, fecha, medicoVeterinario, motivoConsulta, sintomatologia,
				diagnostico, procedimiento, medicamento, dosisMedicamento, idOrden, historialVacunacion,
				alergiasMedicamentos, detalleProcedimiento, anulacion, idOrdenn, idMascota, cedulaDueño,
				cedulaVeterinario, medicamento2, dosis, fechaGeneracion);
		this.idFactura = idFactura;
		idMascota = idMascota2;
		this.idDueño = idDueño;
		this.idOrden2 = idOrden2;
		this.nombreProducto = nombreProducto;
		this.valor = valor;
		this.cantidad = cantidad;
		this.fecha2 = fecha2;
	}
	
	
	
	
}
