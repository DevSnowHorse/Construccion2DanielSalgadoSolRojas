package app.adapter.clinicalhistorys.entity;

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
@Table(name = "clinicalhistory")
public class ClinicalHistoryEntity {
	@Id
	@Column(name = "historyID")
	private long historyID;
	@Column(name="date")
	private Date dateCreated;
	@ManyToOne
	@JoinColumn(name = "veterinarian")
	private UserEntity veterinarian;
	@Column(name = "consultationreason")
	private String consultationreason;
	@Column(name = "symptoms")
	private String symptoms;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "procedure")
	private String procedure;
	@Column(name = "medication")
	private String medication;
	@Column(name = "dosage")
	private String dosage;
	@ManyToOne
	@JoinColumn(name = "orderID")
	private OrderEntity orderID;
	@Column(name = "vaccinationHistory")
	private String vaccinationHistory;
	@Column(name = "allergyMedications")
	private String allergyMedications;
	@Column(name="procedureDetails")
	private String procedureDetails;
	@Column(name="ordercanceled")
	private boolean ordercanceled;
	public long getHistoryID() {
		return historyID;
	}
	public void setHistoryID(long historyID) {
		this.historyID = historyID;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public UserEntity getVeterinarian() {
		return veterinarian;
	}
	public void setVeterinarian(UserEntity veterinarian) {
		this.veterinarian = veterinarian;
	}
	public String getConsultationreason() {
		return consultationreason;
	}
	public void setConsultationreason(String consultationreason) {
		this.consultationreason = consultationreason;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public OrderEntity getOrderID() {
		return orderID;
	}
	public void setOrderID(OrderEntity orderID) {
		this.orderID = orderID;
	}
	public String getVaccinationHistory() {
		return vaccinationHistory;
	}
	public void setVaccinationHistory(String vaccinationHistory) {
		this.vaccinationHistory = vaccinationHistory;
	}
	public String getAllergyMedications() {
		return allergyMedications;
	}
	public void setAllergyMedications(String allergyMedications) {
		this.allergyMedications = allergyMedications;
	}
	public String getProcedureDetails() {
		return procedureDetails;
	}
	public void setProcedureDetails(String procedureDetails) {
		this.procedureDetails = procedureDetails;
	}
	public boolean isOrdercanceled() {
		return ordercanceled;
	}
	public void setOrdercanceled(boolean ordercanceled) {
		this.ordercanceled = ordercanceled;
	}

	
}
