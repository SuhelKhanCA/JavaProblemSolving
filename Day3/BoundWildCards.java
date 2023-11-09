package Day3;

public class BoundWildCards {
    // case 1. Unbound wildcard :Any objects can be passed as its argument
    static void vitality(AnimalWorld<?> animals){
        for(int i =0; i<animals.listOfAnimals.length; i++){
            animals.listOfAnimals[i].print();
            System.out.println();
        }
    }
    // case 2. Lower bounded
    static void showSea(AnimalWorld<? super Aquatic> animals){
        for(int i =0; i<animals.listOfAnimals.length; i++){
            animals.listOfAnimals[i].print();
            System.out.println();
        }
    }
    // Case 3.  Upper Bound
    static void showLand(AnimalWorld<? extends Land> animals){
        for(int i =0; i<animals.listOfAnimals.length; i++){
            animals.listOfAnimals[i].print();
            // call the method defined in Animal class
            System.out.println("Vision: "+animals.listOfAnimals[i].vision);
        }
        System.out.println();
    }

    // case 3b. 
    static void showPet(AnimalWorld<? extends Pet> animals){
        for(int i =0; i<animals.listOfAnimals.length; i++){
            System.out.println("Pet's name : "+ animals.listOfAnimals[i].name);
            animals.listOfAnimals[i].print();

            // call the method defined in the animal class
            System.out.println("Vision: "+ animals.listOfAnimals[i].vision);

        }
        System.out.println();
    }
    // case 3c. 
    static void showWild(AnimalWorld<? extends Wild> animals){
        for(int i =0; i<animals.listOfAnimals.length; i++){
            animals.listOfAnimals[i].print();

            System.out.println("Maximum running speed: "+animals.listOfAnimals[i].speed+" in mph");
            System.out.println("Vision: "+ animals.listOfAnimals[i].vision);
        }
    }

}