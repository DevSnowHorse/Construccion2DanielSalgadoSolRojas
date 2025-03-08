package app.domain.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class User extends Person{
	private String userName;
	private String password;
	public User(long cedula, String name, long edad, String userName, String password) {
		super(cedula, name, edad);
		this.userName = userName;
		this.password = password;
	}

	

	}
	
	

