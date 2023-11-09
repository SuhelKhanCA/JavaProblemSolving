package Day3;

public class Aquatic extends Animal {
    boolean scale;
    Aquatic(long years, float kg, boolean skin){
        super(years, kg); // super class constructor 
        scale=skin;
    }
    public void print(){
        super.print(); // call the super class method
        System.out.println("Has scale ? : "+ scale);
    }
}
