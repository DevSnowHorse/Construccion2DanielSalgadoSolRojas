package app.adapter.bills.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import app.adapter.bills.entity.BillEntity;
import app.adapter.orders.entity.OrderEntity;
import app.adapter.users.entity.UserEntity;

public interface BillRepository extends JpaRepository<BillEntity, Long> {
	public boolean existsByBillID(long billID) ; 
    public BillEntity findByBillID(long billID); 
    List<BillEntity> findByDateCreated(Date date);
}
