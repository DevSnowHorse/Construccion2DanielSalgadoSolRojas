package app.adapter.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.adapter.pets.entity.PetEntity;
import app.domain.models.Pet;

public interface PetRepository extends JpaRepository<PetEntity, Long>{
	public boolean existByPetID(long petID);
	 public PetEntity findByPetID(long petID);
	 
}
