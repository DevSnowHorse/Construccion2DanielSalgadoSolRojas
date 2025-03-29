package app.adapters.persons;

import org.springframework.beans.factory.annotation.Autowired;

import app.adapters.persons.entity.PersonEntity;
import app.adapters.persons.reporitory.PersonRepository;
import app.domain.models.Person;
import app.ports.PersonPort;

public class PersonAdapter implements PersonPort {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public boolean existPerson(long id) {
		return personRepository.existsByid(id);
	}

	@Override
	public void savePerson(Person person) {
		PersonEntity personEntity = personAdapter(person);
		personRepository.save(personEntity);
		person.setId(personEntity.getId());
		
	}
	
	@Override
	public Person findById(long id) {
		PersonEntity personEntity = personRepository.findByid(id);
		return personAdapter(personEntity);
	
	}

	private PersonEntity personAdapter(Person person) {
		PersonEntity personEntity = new PersonEntity();
		personEntity.setId(person.getId());
		personEntity.setAge(person.getAge());
		personEntity.setName(person.getName());
		personEntity.setRole(person.getRole());
		return personEntity;
	}

	
	private Person personAdapter(PersonEntity personEntity) {
		Person person= new Person();
		person.setId(personEntity.getId());
		person.setRole(personEntity.getRole());
		person.setName(personEntity.getName());
		person.setAge(personEntity.getAge());
        return person;
	}

}
