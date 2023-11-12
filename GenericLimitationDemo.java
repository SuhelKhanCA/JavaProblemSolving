// Example 5.3 - genericClass

import JavaGFG.JavaBasics.Student;

class Student<T extends Number> {
    String name;
    T[] marks;
    // constructor
    Student(T[] m){
        marks = m;
    }
    // method to calculate total marks of a student
    double total(){
        double sum = 0;
        for(int i=0; i<marks.length; i++){
            sum+= marks[i].doubleValue();

        }
        return sum;
    }
    boolean compareMarks(Student<T> others){
        if(total()==others.total()){
            return true;
        }
        else 
          return false;
    }
}
class GenericLimitationDemo{
    public static void main(String[] args) {
        
        Integer intMarks1[] = {44, 55, 33, 66, 77};
        Student<Integer> s1IntMarks = new Student<Integer>(intMarks1);
        System.out.println("Total marks: "+s1IntMarks.total());

        Integer intMarks2[] = {49, 39, 53, 69};
        Student<Integer> s2IntMarks = new Student<>(intMarks2);
        System.out.println("Total Marks: 0"+s2IntMarks.total());

        // Compare marks between s1 and s2
        if(s1IntMarks.compareMarks(s2IntMarks)){
            System.out.println("Same Marks");
        }
        else{
            System.out.println("Different Marks");
        }

        // Limitation part

        Double doubleMarks[] = {43.5, 55.5, 32.5, 66.6, 77.7};
        Student<Double> s3DoubleMarks = new Student<>(doubleMarks);
        System.out.println("Total Marks: "+s3DoubleMarks.total());

        Float floatMarks[] = {50.5F, 55.6F, 78.2F, 88.9F};
        Student<Float> s4FloatMarks = new Student<>(floatMarks);
        System.out.println("total Marks:"+ s4FloatMarks.total());

        // // compare marks between s2 and s3 ERRROR
        // if(s2IntMarks.compareMarks(s3DoubleMarks)){
        //     System.out.println("Same Marks");
        // }
        // else
        //     System.out.println("Different Marks");
        
        // // compare s3 and s4 ERRROR
        // if(s3DoubleMarks.compareMarks(s4floatMarks)){
        //     System.out.println("Same marks");
        // }else
        //     System.out.println("Different marks");

        }
}

