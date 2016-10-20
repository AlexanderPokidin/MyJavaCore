package module9.offline8.model.data;

import module9.offline8.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class DataModule {
    private List<Animal> animals = new ArrayList<>();

    public void add(Animal a){
        animals.add(a);
    }

    public void remove (Animal a) {
        animals.remove(a);
    }

    public List<Animal> getAnimals(){
        return 0;
    }
}
