package app.adapter.pets;

import org.springframework.beans.factory.annotation.Autowired;

import app.adapter.pets.entity.PetEntity;
import app.adapter.pets.repository.PetRepository;
import app.adapters.persons.entity.PersonEntity;
import app.domain.models.Person;
import app.domain.models.Pet;
import app.ports.PetPort;

public class PetAdapter implements PetPort {
	@Autowired
	private PetRepository petRepository;
	
	@Override
	public boolean existPet(long petID) {
		return petRepository.existByPetID(petID);
	}

	@Override
	public void savePet(Pet pet) {
		PetEntity petEntity = convertToPetEntity(pet);
		petRepository.save(petEntity);
		pet.setPetID(petEntity.getPetID());
		
	}
	
	@Override
	public Pet findBypetId(long petID) {
		PetEntity petEntity = petRepository.findByPetID(petID);
		return convertToPet(petEntity);
}
	private Pet convertToPet(PetEntity petEntity) {
        if (petEntity == null) return null;

        Pet pet = new Pet();
        pet.setPetName(petEntity.getPetName());
        pet.setOwner(convertToPerson(petEntity.getOwner())); 
        pet.setAge(petEntity.getAge());
        pet.setPetID(petEntity.getPetID());
        pet.setPetSpecie(petEntity.getPetSpecie());
        pet.setPetBreed(petEntity.getPetBreed());
        pet.setPetCharacteristics(petEntity.getPetCharacteristics());
        pet.setWeight(petEntity.getWeight());
        return pet;
    }

    private PetEntity convertToPetEntity(Pet pet) {
        PetEntity petEntity = new PetEntity();
        petEntity.setPetName(pet.getPetName());
        petEntity.setOwner(convertToPersonEntity(pet.getOwner())); // 
        petEntity.setAge(pet.getAge());
        petEntity.setPetID(pet.getPetID());
        petEntity.setPetSpecie(pet.getPetSpecie());
        petEntity.setPetBreed(pet.getPetBreed());
        petEntity.setPetCharacteristics(pet.getPetCharacteristics());
        petEntity.setWeight(pet.getWeight());
        return petEntity;
    }
    
    private Person convertToPerson(PersonEntity personEntity) {
        if (personEntity == null) return null;
        
        Person person = new Person();
        person.setId(personEntity.getId());
        person.setName(personEntity.getName());
        person.setAge(personEntity.getAge());
        person.setRole(personEntity.getRole());
        return person;
    }

    private PersonEntity convertToPersonEntity(Person person) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(person.getId());
        personEntity.setName(person.getName());
        personEntity.setAge(person.getAge());
        personEntity.setRole(person.getRole());
        return personEntity;
    }
}
