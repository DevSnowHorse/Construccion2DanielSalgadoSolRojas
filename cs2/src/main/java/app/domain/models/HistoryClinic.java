package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class HistoryClinic extends User{

    private long fecha;
    private String medicoVeterinario;
    private String motivoConsulta;
    private String sintomatologia;
    private String diagnostico;
    private String procedimiento;
    private String medicamento;
    private String dosisMedicamento;
    private long idOrden;
    private String historialVacunacion;
    private String alergiasMedicamentos;
    private String detalleProcedimiento;
	private boolean anulacion;
	public HistoryClinic(long cedula, String name, long edad, String userName, String password, long fecha,
			String medicoVeterinario, String motivoConsulta, String sintomatologia, String diagnostico,
			String procedimiento, String medicamento, String dosisMedicamento, long idOrden, String historialVacunacion,
			String alergiasMedicamentos, String detalleProcedimiento, boolean anulacion) {
		super(cedula, name, edad, userName, password);
		this.fecha = fecha;
		this.medicoVeterinario = medicoVeterinario;
		this.motivoConsulta = motivoConsulta;
		this.sintomatologia = sintomatologia;
		this.diagnostico = diagnostico;
		this.procedimiento = procedimiento;
		this.medicamento = medicamento;
		this.dosisMedicamento = dosisMedicamento;
		this.idOrden = idOrden;
		this.historialVacunacion = historialVacunacion;
		this.alergiasMedicamentos = alergiasMedicamentos;
		this.detalleProcedimiento = detalleProcedimiento;
		this.anulacion = anulacion;
	}
	
	
	
	
}
