package Day3;

public class Land extends Animal {
    short vision; // 0=nocturnal, 1=only day light , 2=both
    Land(long years, float kg, short vision){
        super(years, kg); // super class constructor
        this.vision = vision;
    }

}
