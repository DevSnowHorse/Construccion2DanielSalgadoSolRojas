package app.adapter.bills.entity;

import java.sql.Date;

import app.adapter.orders.entity.OrderEntity;
import app.adapter.pets.entity.PetEntity;
import app.adapter.users.entity.UserEntity;
import app.adapters.persons.entity.PersonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bill")
public class BillEntity {
	@Id
	@Column(name = "billID")
	private long billID;
	@ManyToOne
	@JoinColumn(name = "pet")
	private PetEntity pet;
	@ManyToOne
	@JoinColumn(name = "owner")
	private PersonEntity owner;
	@ManyToOne
	@JoinColumn(name = "order")
	private OrderEntity order;
	@Column(name = "price")
	private int price;
	@Column(name = "amount")
	private long amount;
	@Column(name="medicine")
	private String medicine;
	@Column(name="date")
	private Date dateCreated;
	public long getBillID() {
		return billID;
	}
	public void setBillID(long billID) {
		this.billID = billID;
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
	public OrderEntity getOrder() {
		return order;
	}
	public void setOrder(OrderEntity order) {
		this.order = order;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
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
