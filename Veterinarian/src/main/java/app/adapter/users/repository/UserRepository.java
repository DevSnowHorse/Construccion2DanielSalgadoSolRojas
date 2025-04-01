package app.adapter.users.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import app.adapters.persons.entity.PersonEntity;
import app.adapter.users.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	boolean existsByUsername(String username) ; 
    Optional<UserEntity> findByPersonId(long personId); 
    Optional<UserEntity> findByUsername(String username); 
    List<UserEntity> findByRole(String role);

}
