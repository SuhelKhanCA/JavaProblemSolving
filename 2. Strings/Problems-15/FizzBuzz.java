import java.util.ArrayList;
import java.util.List;
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ls = new ArrayList<>(n);

        for(int i=1; i<=n; i++){
            if(i % 3 ==0 && i % 5 == 0){
                ls.add("FixxBuzz");
            } else if( i % 3 == 0){
                ls.add("Fizz");
            } else if(i % 5 == 0){
                ls.add("Buzz");
            }else{
                ls.add(Integer.toString(i));
            }
        }

        return ls;
    }
    public static void main(String[] args) {
        
    }
}
