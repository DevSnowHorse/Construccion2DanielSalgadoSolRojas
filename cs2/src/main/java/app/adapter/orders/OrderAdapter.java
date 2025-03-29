package app.adapter.orders;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapter.orders.entity.OrderEntity;
import app.adapter.orders.repository.OrderRepository;
import app.adapter.pets.entity.PetEntity;
import app.adapter.pets.repository.PetRepository;
import app.adapter.users.entity.UserEntity;
import app.adapters.persons.entity.PersonEntity;
import app.domain.models.Order;
import app.domain.models.Person;
import app.domain.models.Pet;
import app.domain.models.User;
import app.ports.OrderPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
public class OrderAdapter implements OrderPort {
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public boolean existOrder(long orderID) {
		return orderRepository.existsByOrderID(orderID);
	}

	@Override
	public void saveOrder(Order order) {
		OrderEntity orderEntity = convertToOrderEntity(order);
		orderRepository.save(orderEntity);
		order.setOrderID(orderEntity.getOrderID());
	}
	
	@Override
	public Order findByOrderID(long orderID) {
		OrderEntity orderEntity = orderRepository.findByOrderID(orderID);
		return convertToOrder(orderEntity);
}
	@Override
	public List<Order> findAllsOrders(){
		return orderRepository.findAll().stream()
				.map(this::convertToOrder)
                .collect(Collectors.toList());	
	}
	
	private Order convertToOrder(OrderEntity orderEntity) {
        if (orderEntity == null) return null;

        Order order = new Order();
        order.setOrderID(orderEntity.getOrderID());
        order.setOwner(convertToPerson(orderEntity.getOwner())); 
        order.setPet(convertToPet(orderEntity.getPet())); 
        order.setVeterinarian(convertToUser(orderEntity.getVeterinarian())); 
        order.setMedicine(orderEntity.getMedicine());
        order.setDateCreated(orderEntity.getDateCreated());
        return order;
    }
	
	private OrderEntity convertToOrderEntity(Order order) {
		
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderID(order.getOrderID());
        orderEntity.setOwner(convertToPersonEntity(order.getOwner())); 
        orderEntity.setPet(convertToPetEntity(order.getPet())); 
        orderEntity.setVeterinarian(convertToUserEntity(order.getVeterinarian())); 
        orderEntity.setMedicine(order.getMedicine());
        orderEntity.setDateCreated(order.getDateCreated());
        return orderEntity;
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
	private User convertToUser(UserEntity userEntity) {
		return null;
	}
	private UserEntity convertToUserEntity(User user) {
		return null;
	}
	
}
