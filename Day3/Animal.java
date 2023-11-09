package Day3;

public class Animal {
    long lifespan;
    float weight;
    Animal(long years, float kg){
        lifespan = years;
        weight = kg;
    }
    public void print(){
        System.out.println("Maximum longevity:"+lifespan+"years");
        System.out.println("maximum weight: "+ weight+"kgs");
    }
}
