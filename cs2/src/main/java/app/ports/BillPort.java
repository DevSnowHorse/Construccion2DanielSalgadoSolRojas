package app.ports;

import java.util.List;
import app.domain.models.Bill;
public interface BillPort {
	public boolean existBill(long billID);
    public void saveBill(Bill bill);
    public Bill findByBill(long billID);
    List<Bill> findAllBill();
}
	

