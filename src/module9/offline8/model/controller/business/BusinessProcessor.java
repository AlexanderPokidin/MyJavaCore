package module9.offline8.model.controller.business;

import module9.offline8.model.Animal;

import java.util.List;

public interface BusinessProcessor {

    public int getSumOfAgesOfAnimals();

    public Animal getOldestAnimal();

    public List<Animal> getAnimalsByName(String name);

    //public void enrichAnimals(String name; int delta);

}
