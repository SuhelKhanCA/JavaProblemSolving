package Day3;

public class AnimalWorld <T extends Animal> {
    // type paramter is limited to animal
    T [] listOfAnimals;
    AnimalWorld(T [] list){ // genercic constructor to create type T
        listOfAnimals = list;
    }
}
