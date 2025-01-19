import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "IX";
        System.out.println(findDecimal(s));
    }

    static int findDecimal(String romanStr) {
        int result = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        result = hm.get(romanStr.charAt(romanStr.length()-1));
        
        for (int i =  romanStr.length()-2; i >= 0; i--) {
            char ch = romanStr.charAt(i);
            char next = romanStr.charAt(i+1);
            if (hm.get(ch) >= hm.get(next)) {
                result += hm.get(ch);
            } else {
                result -= hm.get(ch);
            }
        }

        return result;
    }
}
