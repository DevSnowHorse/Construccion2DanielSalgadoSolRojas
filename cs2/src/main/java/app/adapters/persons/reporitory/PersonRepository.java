package app.adapters.persons.reporitory;
import org.springframework.data.jpa.repository.JpaRepository;

import app.adapters.persons.entity.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

	boolean existsByid(long id);

	PersonEntity findByid(long id);
}
