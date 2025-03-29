package app.adapter.pets.entity;

import app.adapters.persons.entity.PersonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pet")
public class PetEntity {
	@Id
	@Column(name = "petID")
	private long petID;
	@Column(name = "age")
	private long age;
	@Column(name = "petName")
	private String petName;
	@Column(name = "petSpecie")
	private String petSpecie;
	@Column(name = "petBreed")
	private String petBreed;
	@Column(name = "petCharacteristics")
	private String petCharacteristics;
	@Column(name = "weight")
	private long weight;
	@JoinColumn(name="owner")
	@OneToOne
	private PersonEntity owner;

	public long getPetID() {
		return petID;
	}

	public void setPetID(long petID) {
		this.petID = petID;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
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

	public PersonEntity getOwner() {
		return owner;
	}

	public void setOwner(PersonEntity owner) {
		this.owner = owner;
	}
	
	
}
