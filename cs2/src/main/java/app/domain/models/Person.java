
package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Person {
    private long cedula;
    private String name;
    private long edad;
	public Person(long cedula, String name, long edad) {
		super();
		this.cedula = cedula;
		this.name = name;
		this.edad = edad;
	}
    
 

}
