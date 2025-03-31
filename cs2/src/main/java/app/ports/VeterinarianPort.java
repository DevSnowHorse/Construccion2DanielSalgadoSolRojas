package app.ports;

import java.util.List;
import app.domain.models.Person;
import app.domain.models.ClinicalHistory;
import app.domain.models.Order;

public interface VeterinarianPort {
    boolean existVeterinarian(long id);
    void saveVeterinarian(Person veterinarian);
    Person findByVeterinarianId(long id);
    List<Person> findAllVeterinarians();
    void registerClinicalHistory(long petId, ClinicalHistory clinicalHistory);
    Order createOrder(long petId, long veterinarianId, Order order);
    List<Order> findOrdersByVeterinarian(long veterinarianId);
    ClinicalHistory findClinicalHistoryByPetId(long petId);
    void cancelOrder(long orderId);
}