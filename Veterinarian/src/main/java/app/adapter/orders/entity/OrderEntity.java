package app.adapter.orders.entity;
import java.sql.Date;

import app.adapter.pets.entity.PetEntity;
import app.adapter.users.entity.UserEntity;
import app.adapters.persons.entity.PersonEntity;
import app.domain.models.ClinicalHistory;
import app.domain.models.Person;
import app.domain.models.Pet;
import app.domain.models.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "order")

public class OrderEntity {
	@Id
	@Column(name = "orderID")
	private long orderID;
	@ManyToOne
	@JoinColumn(name = "pet")
	private PetEntity pet;
	@ManyToOne
	@JoinColumn(name = "owner")
	private PersonEntity owner;
	@ManyToOne
	@JoinColumn(name = "veterinarian")
	private UserEntity veterinarian;
	@Column(name="medicine")
	private String medicine;
	@Column(name="date")
	private Date dateCreated;
	public long getOrderID() {
		return orderID;
	}
	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}
	public PetEntity getPet() {
		return pet;
	}
	public void setPet(PetEntity pet) {
		this.pet = pet;
	}
	public PersonEntity getOwner() {
		return owner;
	}
	public void setOwner(PersonEntity owner) {
		this.owner = owner;
	}
	public UserEntity getVeterinarian() {
		return veterinarian;
	}
	public void setVeterinarian(UserEntity veterinarian) {
		this.veterinarian = veterinarian;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
}

