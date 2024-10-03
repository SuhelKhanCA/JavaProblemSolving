package Level1;

public class CountZero {
    static int count(int n, int c){
        if(n%10 == n){
            return c;
        }
        if (n%10 == 0) {
            return count(n/10, ++c);
        }else{
            return count(n/10, c);
        }
    }
    public static void main(String[] args) {
        int n = 10204;
        System.out.println(count(n, 0));
    }
}
