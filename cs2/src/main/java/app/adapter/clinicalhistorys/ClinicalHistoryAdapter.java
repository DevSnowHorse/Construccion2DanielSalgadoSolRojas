package app.adapter.clinicalhistorys;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapter.clinicalhistorys.entity.ClinicalHistoryEntity;
import app.adapter.clinicalhistorys.repository.ClinicalHistoryRepository;
import app.adapter.orders.entity.OrderEntity;
import app.adapter.users.entity.UserEntity;
import app.domain.models.ClinicalHistory;
import app.domain.models.Order;
import app.domain.models.User;
import app.ports.ClinicalHistoryPort;

@Service
public class ClinicalHistoryAdapter implements ClinicalHistoryPort {
    @Autowired
    private ClinicalHistoryRepository clinicalHistoryRepository; 

    @Override
    public boolean existClinicalHistory(long historyID) {
        return clinicalHistoryRepository.existsByHistoryID(historyID); 
    }

    @Override
    public void saveClinicalHistory(ClinicalHistory clinicalHistory) {
        ClinicalHistoryEntity clinicalHistoryEntity = convertToClinicalHistoryEntity(clinicalHistory);
        clinicalHistoryRepository.save(clinicalHistoryEntity);
        clinicalHistory.setHistoryID(clinicalHistoryEntity.getHistoryID());
        }

    @Override
    public ClinicalHistory findByClinicalHistoryID(long historyID) {
        ClinicalHistoryEntity clinicalHistoryEntity = clinicalHistoryRepository.findByHistoryID(historyID);
        return convertToClinicalHistory(clinicalHistoryEntity);
    }

    @Override
    public List<ClinicalHistory> findAllsClinicalHistorys() {
        return clinicalHistoryRepository.findAll().stream()
                .map(this::convertToClinicalHistory)
                .collect(Collectors.toList());
    }

    private ClinicalHistory convertToClinicalHistory(ClinicalHistoryEntity clinicalHistoryEntity) {
        if (clinicalHistoryEntity == null) return null;

        ClinicalHistory clinicalHistory = new ClinicalHistory();
        clinicalHistory.setHistoryID(clinicalHistoryEntity.getHistoryID());
        clinicalHistory.setDateCreated(clinicalHistoryEntity.getDateCreated());
        clinicalHistory.setVeterinarian(convertToUser(clinicalHistoryEntity.getVeterinarian()));
        clinicalHistory.setConsultationreason(clinicalHistoryEntity.getConsultationreason());
        clinicalHistory.setSymptoms(clinicalHistoryEntity.getSymptoms());
        clinicalHistory.setDiagnosis(clinicalHistoryEntity.getDiagnosis());
        clinicalHistory.setProcedure(clinicalHistoryEntity.getProcedure());
        clinicalHistory.setMedication(clinicalHistoryEntity.getMedication());
        clinicalHistory.setDosage(clinicalHistoryEntity.getDosage());
        clinicalHistory.setOrderID(convertToOrder(clinicalHistoryEntity.getOrderID()));
        clinicalHistory.setVaccinationHistory(clinicalHistoryEntity.getVaccinationHistory());
        clinicalHistory.setAllergyMedications(clinicalHistoryEntity.getAllergyMedications());
        clinicalHistory.setProcedureDetails(clinicalHistoryEntity.getProcedureDetails());
        clinicalHistory.setOrdercanceled(clinicalHistoryEntity.isOrdercanceled());
        return clinicalHistory;
    }

    private ClinicalHistoryEntity convertToClinicalHistoryEntity(ClinicalHistory clinicalHistory) {
        ClinicalHistoryEntity entity = new ClinicalHistoryEntity();
        entity.setHistoryID(clinicalHistory.getHistoryID());
        entity.setDateCreated(clinicalHistory.getDateCreated());
        entity.setVeterinarian(convertToUserEntity(clinicalHistory.getVeterinarian()));
        entity.setConsultationreason(clinicalHistory.getConsultationreason());
        entity.setSymptoms(clinicalHistory.getSymptoms());
        entity.setDiagnosis(clinicalHistory.getDiagnosis());
        entity.setProcedure(clinicalHistory.getProcedure());
        entity.setMedication(clinicalHistory.getMedication());
        entity.setDosage(clinicalHistory.getDosage());
        entity.setOrderID(convertToOrderEntity(clinicalHistory.getOrderID()));
        entity.setVaccinationHistory(clinicalHistory.getVaccinationHistory());
        entity.setAllergyMedications(clinicalHistory.getAllergyMedications());
        entity.setProcedureDetails(clinicalHistory.getProcedureDetails());
        entity.setOrdercanceled(clinicalHistory.isOrdercanceled());
        return entity;
    }

    private User convertToUser(UserEntity userEntity) {
        return null; 
    }

    private UserEntity convertToUserEntity(User user) {
        return null; 
    }

    private Order convertToOrder(OrderEntity orderEntity) {
        return null; 
    }

    private OrderEntity convertToOrderEntity(Order order) {
        return null; 
    }
}