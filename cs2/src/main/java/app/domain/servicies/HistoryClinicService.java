package app.domain.services;

import app.domain.models.HistoryClinic;
import app.domain.repositories.HistoryClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryClinicService {

    private final HistoryClinicRepository historyClinicRepository;

    @Autowired
    public HistoryClinicService(HistoryClinicRepository historyClinicRepository) {
        this.historyClinicRepository = historyClinicRepository;
    }

    public HistoryClinic saveHistoryClinic(HistoryClinic historyClinic) {
        return historyClinicRepository.save(historyClinic);
    }

    public HistoryClinic getHistoryClinicById(Long id) {
        return historyClinicRepository.findById(id).orElse(null);
    }

    public void deleteHistoryClinic(Long id) {
        historyClinicRepository.deleteById(id);
    }
}
