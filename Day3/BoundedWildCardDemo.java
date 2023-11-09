package Day3;

public class BoundedWildCardDemo {
    public static void main(String[] args) {
        // create a list of unknown animals of class Animal
        Animal unknown = new Animal(40, 720);
        Animal u[] ={unknown};
        AnimalWorld<Animal> uList = new AnimalWorld<Animal>(u);

        // create aquatic
        Aquatic whale = new Aquatic(90, 150000, false);
        Aquatic shark = new Aquatic(400, 50000, false);

        Animal q[]={whale, shark};

        AnimalWorld<Animal> qList = new AnimalWorld<Animal>(q);

        // craete a listb of land annimals
        Land owl = new Land(3, 1, (short) 0);
        Land l[] ={owl};
        AnimalWorld<Land> lList = new AnimalWorld<Land>(l);

        // create a list of pet animals

        Pet dog = new Pet(15, 75, (short) 2);
        Pet p[] = {new Pet(15, 75, (short) 2)};

        AnimalWorld<Pet> pList = new AnimalWorld<Pet>(p);

        // create a list of wild animals

        Wild cheetah = new Wild(15, 75, (short) 2);
        Wild deer = new Wild(10, 50, (short) 1);

        Wild w[]={cheetah, deer};

        AnimalWorld<Wild> wList = new AnimalWorld<Wild>(w);


        //////// Calling the methoddd===========Not Working
        // vitality(uList);
        // vitality(qList);
        // vitality(lList);
        // vitality(pList);
        // vitality(wList);

        // classs method
        // showSea(uList);
        // showSea(qList);
        // showSea(lList);
        // showSea(pList);
        // showSea(wList);

        // showLand(uList);
        // showLand(qList);
        // showLand(lList);
        // showLand(pList);
        // showLand(wList);

        // showPet(uList);
        // showPet(qList);
        // showPet(lList);
        // showPet(pList);
        // showPet(wList);
    }

   

}
