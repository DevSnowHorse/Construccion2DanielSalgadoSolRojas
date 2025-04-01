package app.adapter.bills;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapter.bills.entity.BillEntity;
import app.adapter.bills.repository.BillRepository;
import app.adapter.orders.entity.OrderEntity;
import app.adapter.pets.entity.PetEntity;
import app.adapter.users.entity.UserEntity;
import app.adapters.persons.entity.PersonEntity;
import app.domain.models.Bill;
import app.domain.models.Order;
import app.domain.models.Person;
import app.domain.models.Pet;
import app.domain.models.User;
import app.ports.BillPort;

@Service
public class BillAdapter implements BillPort {
	@Autowired
	private BillRepository billRepository;
	
	@Override
	public boolean existBill(long billID) {
		return billRepository.existsByBillID(billID);
	}

	@Override
	public void saveBill(Bill bill) {
		BillEntity billEntity = convertToBillEntity(bill);
		billRepository.save(billEntity);
		bill.setBillID(billEntity.getBillID());
		
	}

	@Override
	public Bill findByBill(long billID) {
		BillEntity billEntity = billRepository.findByBillID(billID);
		return convertToBill(billEntity);
	}	
	@Override
	public List<Bill> findAllBill(){
		return billRepository.findAll().stream()
				.map(this::convertToBill)
				.collect(Collectors.toList());
	}	
	
	private Bill convertToBill(BillEntity billEntity) {
        if (billEntity == null) return null;

        Bill bill = new Bill();
        bill.setBillID(billEntity.getBillID());
        bill.setOwner(convertToPerson(billEntity.getOwner())); 
        bill.setPet(convertToPet(billEntity.getPet())); 
        bill.setOrder(convertToOrder(billEntity.getOrder())); 
        bill.setPrice(billEntity.getPrice());
        bill.setAmount(billEntity.getAmount());
        bill.setMedicine(billEntity.getMedicine());
        bill.setDateCreated(billEntity.getDateCreated());
        return bill;
    }
	
	private BillEntity convertToBillEntity(Bill bill) {
		BillEntity entity = new BillEntity();
	    entity.setBillID(bill.getBillID());
	    entity.setOwner(convertToPersonEntity(bill.getOwner())); 
	    entity.setPet(convertToPetEntity(bill.getPet())); 
	    entity.setOrder(convertToOrderEntity(bill.getOrder())); 
	    entity.setPrice(bill.getPrice());
	    entity.setAmount(bill.getAmount());
	    entity.setMedicine(bill.getMedicine());
	    entity.setDateCreated(bill.getDateCreated());
	    return entity;
    }
	
	private Pet convertToPet(PetEntity petEntity) {
		return null;
	}
	private PetEntity convertToPetEntity(Pet pet) {
		return null;
	}
	private Person convertToPerson(PersonEntity personEntity) {
		return null;
	}
	private PersonEntity convertToPersonEntity(Person person) {
		return null;
	}
	private Order convertToOrder(OrderEntity orderEntity) {
		return null;
	}
	private OrderEntity convertToOrderEntity(Order order) {
		return null;
	}
}
