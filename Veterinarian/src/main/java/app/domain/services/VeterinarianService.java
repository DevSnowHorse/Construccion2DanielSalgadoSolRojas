package app.domain.services;

import app.domain.models.Veterinarian;
import app.domain.models.MedicalHistory;
import app.domain.models.MedicationOrder;
import app.domain.ports.VeterinarianPort;
import app.domain.ports.MedicalHistoryPort;
import app.domain.ports.MedicationOrderPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinarianService {

    @Autowired
    private VeterinarianPort veterinarianPort;

    @Autowired
    private MedicalHistoryPort medicalHistoryPort;

    @Autowired
    private MedicationOrderPort medicationOrderPort;

    public void createMedicalHistory(MedicalHistory medicalHistory) throws Exception {
        Veterinarian veterinarian = veterinarianPort.findByUserId(medicalHistory.getVeterinarianId());
        if (veterinarian == null) {
            throw new Exception("Veterinarian not found.");
        }

        // Validate the medical history fields and save.
        if (medicalHistory.getDiagnosis() == null || medicalHistory.getDiagnosis().isEmpty()) {
            throw new Exception("Diagnosis cannot be empty.");
        }

        medicalHistoryPort.saveMedicalHistory(medicalHistory);
    }

    public void createMedicationOrder(MedicationOrder medicationOrder) throws Exception {
        Veterinarian veterinarian = veterinarianPort.findByUserId(medicationOrder.getVeterinarianId());
        if (veterinarian == null) {
            throw new Exception("Veterinarian not found.");
        }

        // Ensure the order is valid before saving.
        if (medicationOrder.getMedication() == null || medicationOrder.getMedication().isEmpty()) {
            throw new Exception("Medication cannot be empty.");
        }

        medicationOrderPort.saveMedicationOrder(medicationOrder);
    }

    // Additional methods for managing medical histories and medication orders.
}
