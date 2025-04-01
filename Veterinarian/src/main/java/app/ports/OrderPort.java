package app.ports;
import java.util.List;

import app.domain.models.Order;
public interface OrderPort {
		public boolean existOrder(long orderID);
	    public void saveOrder(Order order);
	    public Order findByOrderID(long orderID);
	    List<Order> findAllsOrders();
}
