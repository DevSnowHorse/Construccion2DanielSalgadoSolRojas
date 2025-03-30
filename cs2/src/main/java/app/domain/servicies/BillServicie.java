package app.domain.servicies;

import app.domain.models.Bill;
import app.domain.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BillService {

    private final BillRepository billRepository;

 
    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

  
    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

  
    public Optional<Bill> getBillById(Long id) {
        return billRepository.findById(id);
    }

  
    public void deleteBill(Long id) {
        billRepository.deleteById(id);
    }

  
}
