package Arrays;
import java.util.*;
public class RemovingEvenNumbers{
    public static void main(String[] args) {
       Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> numbers = new ArrayList<Integer>();
       
        Collections.addAll(numbers, arr);

        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);
        // numbers.add(4);
        // numbers.add(5);
        // numbers.add(6);
        // numbers.add(7);
        // numbers.add(8);
        // numbers.add(9);
        // numbers.add(10);
        // numbers.add(11);
        // numbers.add(12);
        // numbers.add(13);
        
        System.out.println("Before removing : " + numbers);
        for (int i = numbers.size() -1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        System.out.println("After removing : " + numbers);
    }
}