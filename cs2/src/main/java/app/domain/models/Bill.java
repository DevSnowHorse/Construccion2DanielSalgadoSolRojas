package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Bill extends HistoryClinic{

	
	private String idOrdenn;            
    private long idMascota;          
    private long cedulaDueño;         
    private long cedulaVeterinario;    
    private String medicamento;        
    private String dosis;              
    private String fechaGeneracion;
	public Bill(long cedula, String name, long edad, String userName, String password, long fecha,
			String medicoVeterinario, String motivoConsulta, String sintomatologia, String diagnostico,
			String procedimiento, String medicamento, String dosisMedicamento, long idOrden, String historialVacunacion,
			String alergiasMedicamentos, String detalleProcedimiento, boolean anulacion, String idOrdenn,
			long idMascota, long cedulaDueño, long cedulaVeterinario, String medicamento2, String dosis,
			String fechaGeneracion) {
		super(cedula, name, edad, userName, password, fecha, medicoVeterinario, motivoConsulta, sintomatologia,
				diagnostico, procedimiento, medicamento, dosisMedicamento, idOrden, historialVacunacion,
				alergiasMedicamentos, detalleProcedimiento, anulacion);
		this.idOrdenn = idOrdenn;
		this.idMascota = idMascota;
		this.cedulaDueño = cedulaDueño;
		this.cedulaVeterinario = cedulaVeterinario;
		medicamento = medicamento2;
		this.dosis = dosis;
		this.fechaGeneracion = fechaGeneracion;
	}
    
    
    
	}
	
	

