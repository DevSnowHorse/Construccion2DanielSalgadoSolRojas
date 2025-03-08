package app.domain.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor

public class Pet extends User{

	private long cedulaOwn;
	private long edad;
	private long petId;
	private String name;
	private String especie;
	private String raza;
	private String petCaracteristicas;
	private long peso;

	public Pet(long cedula, String name, long edad, String userName, String password, long cedulaOwn, long edad2,
			long petId, String name2, String especie, String raza, String petCaracteristicas, long peso) {
		super(cedula, name, edad, userName, password);
		this.cedulaOwn = cedulaOwn;
		edad = edad2;
		this.petId = petId;
		name = name2;
		this.especie = especie;
		this.raza = raza;
		this.petCaracteristicas = petCaracteristicas;
		this.peso = peso;
	}
	
	
	

	
	
	}
	
	
	
	

