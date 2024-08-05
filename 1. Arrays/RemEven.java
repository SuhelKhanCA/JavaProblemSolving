package Arrays;
import java.util.*;
public class RemEven{
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      
        List<Integer> numbers = Arrays.asList(arr);
        System.out.println("Before removing : " + (numbers));
        for (int i = numbers.size() -1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
         }
        for (int i = numbers.size() -1; i >= 0; i--) {
           // if ((numbers.get(i)) % 2 == 0) { // bad operand types for binary operator '%'
           if (arr[i] % 2 == 0) {
                numbers.remove(i);
            }
        }
        //System.out.println("After removing : " + numbers);
        for (int i = numbers.size() -1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
         }
    }
}