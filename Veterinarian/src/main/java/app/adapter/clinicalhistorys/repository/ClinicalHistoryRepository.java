package app.adapter.clinicalhistorys.repository;

import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import app.adapter.bills.entity.BillEntity;
import app.adapter.clinicalhistorys.entity.ClinicalHistoryEntity;

public interface ClinicalHistoryRepository extends JpaRepository<ClinicalHistoryEntity, Long> {
	public boolean existsByHistoryID(long historyID) ; 
    public ClinicalHistoryEntity findByHistoryID(long historyID); 
    List<ClinicalHistoryEntity> findByDateCreated(Date date);
}
