package app.adapter.orders.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import app.adapter.orders.entity.OrderEntity;
import app.domain.models.Order;

public interface OrderRepository  extends JpaRepository<OrderEntity, Long> {
	public boolean existsByOrderID (long orderID);
	public  OrderEntity findByOrderID(long orderID);

}
