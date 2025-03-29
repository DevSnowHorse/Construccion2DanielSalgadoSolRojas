package app.domain.models;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class ClinicalHistory {

	private long historyID;
	private Date dateCreated;
	private User veterinarian;
	private String consultationreason;
	private String symptoms;
	private String diagnosis;
	private String procedure;
	private String medication;
	private String dosage;
	private Order orderID;
	private String vaccinationHistory;
	private String allergyMedications;
	private String procedureDetails;
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
	public User getVeterinarian() {
		return veterinarian;
	}
	public void setVeterinarian(User veterinarian) {
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
	public Order getOrderID() {
		return orderID;
	}
	public void setOrderID(Order orderID) {
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
