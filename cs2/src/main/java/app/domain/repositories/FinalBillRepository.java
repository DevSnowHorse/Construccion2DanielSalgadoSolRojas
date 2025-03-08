package app.domain.repositories;

import app.domain.models.FinalBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinalBillRepository extends JpaRepository<FinalBill, Long> {
    
}
