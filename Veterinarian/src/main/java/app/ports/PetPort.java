package app.ports;

import app.domain.models.Pet;
public interface PetPort {
	public boolean existPet(long petID);
    public void savePet(Pet pet);
    public Pet findBypetId(long petID);
}
