package app.ports;

import java.util.List;

import app.domain.models.Person;
import app.domain.models.User;

public interface UserPort {
	boolean existUserName(String username); 
    void saveUser(User user) throws Exception ;
    User findByPersonId(long id);
    User registerDealer(Person person); 
    User registerVeterinarian(Person person);
    List<User> findUsersByRole(String role); 
    User findByUserName(String username);
}
