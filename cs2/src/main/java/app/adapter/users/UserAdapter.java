package app.adapter.users;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.adapters.persons.entity.PersonEntity;
import app.adapter.users.entity.UserEntity;
import app.adapter.users.repository.UserRepository;
import app.domain.models.Person;
import app.domain.models.User;
import app.ports.UserPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@Service
public class UserAdapter implements UserPort {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean existUserName(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("El usuario no puede estar vacio.");
        }
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new IllegalArgumentException("El usuario ya esta en uso.");
        }

        UserEntity userEntity = convertToUserEntity(user);
        userRepository.save(userEntity);
        user.setId(userEntity.getId());
    }

    @Override
    public User findByPersonId(long id) {
        UserEntity userEntity = userRepository.findByPersonId(id).orElse(null);
        return convertToUser(userEntity);
    }

    @Override
    public User registerDealer(Person person) {
        User user = new User();
        user.setId(person.getId());
        user.setName(person.getName());
        user.setAge(person.getAge());
        user.setRole("DEALER");
        user.setUsername(person.getName().toLowerCase() + "_dealer");
        user.setPassword("defaultpassword");

        //saveUser(user);
        return user;
    }

    @Override
    public User registerVeterinarian(Person person) {
        User user = new User();
        user.setId(person.getId());
        user.setName(person.getName());
        user.setAge(person.getAge());
        user.setRole("VETERINARIAN");
        user.setUsername(person.getName().toLowerCase() + "_vet");
        user.setPassword("defaultpassword");

        //saveUser(user);
        return user;
    }

    @Override
    public List<User> findUsersByRole(String role) {
        List<UserEntity> userEntities = userRepository.findByRole(role);
        return userEntities.stream()
                .map(this::convertToUser)
                .collect(Collectors.toList());
    }

    @Override
    public User findByUserName(String username) {
        UserEntity userEntity = userRepository.findByUsername(username).orElse(null);
        return convertToUser(userEntity);
    }

    private User convertToUser(UserEntity userEntity) {
        if (userEntity == null) return null;

        User user = new User();
        user.setId(userEntity.getId());
        if (userEntity.getPerson() != null) {
            user.setName(userEntity.getPerson().getName());
            user.setAge(userEntity.getPerson().getAge());
            user.setRole(userEntity.getPerson().getRole());
        }
        user.setUsername(userEntity.getUsername());
        user.setPassword(userEntity.getPassword());
        return user;
    }

    private UserEntity convertToUserEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setPerson(convertToPersonEntity(user));
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        return userEntity;
    }

    private PersonEntity convertToPersonEntity(User user) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(user.getId());
        personEntity.setName(user.getName());
        personEntity.setAge(user.getAge());
        personEntity.setRole(user.getRole());
        return personEntity;
    }
}

	
