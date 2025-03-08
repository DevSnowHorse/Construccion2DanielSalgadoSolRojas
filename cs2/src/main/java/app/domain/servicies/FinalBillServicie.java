package app.domain.services;

import app.domain.models.FinalBill;
import app.domain.repositories.FinalBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinalBillService {

    private final FinalBillRepository finalBillRepository;

    @Autowired
    public FinalBillService(FinalBillRepository finalBillRepository) {
        this.finalBillRepository = finalBillRepository;
    }

    public FinalBill saveFinalBill(FinalBill finalBill) {
        return finalBillRepository.save(finalBill);
    }

    public FinalBill getFinalBillById(Long id) {
        return finalBillRepository.findById(id).orElse(null);
    }

    public void deleteFinalBill(Long id) {
        finalBillRepository.deleteById(id);
    }
}
