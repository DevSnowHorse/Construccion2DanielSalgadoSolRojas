package app.domain.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor

public class Pet {

	private String petName;
	private Person owner;
	private long age;
	private long petID;
	private String petSpecie;
	private String petBreed;
	private String petCharacteristics;
	private long weight;
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public long getPetID() {
		return petID;
	}
	public void setPetID(long petID) {
		this.petID = petID;
	}
	public String getPetSpecie() {
		return petSpecie;
	}
	public void setPetSpecie(String petSpecie) {
		this.petSpecie = petSpecie;
	}
	public String getPetBreed() {
		return petBreed;
	}
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	public String getPetCharacteristics() {
		return petCharacteristics;
	}
	public void setPetCharacteristics(String petCharacteristics) {
		this.petCharacteristics = petCharacteristics;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}

    
	
	}
	
	
	
	

