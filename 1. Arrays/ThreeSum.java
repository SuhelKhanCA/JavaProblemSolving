import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        // int[] arr = {7, -6, 3, 8, -1, 8, -1};
        int[] arr = {3, 3, 4, 2,2, 4, 6,2 , 2, -1, -1, 1, 1};
        // int target = 0;
        int target = 6;
        solution(arr, target, arr.length);
    }
   public static void solution(int []a, int target, int n){
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if (i==0 || a[i] !=a[i-1]) {
                int j = i +1; int k = n-1;
                int tar = target - a[i];

                while (j < k) {
                    if (a[j] + a[k] == tar) {
                        System.out.println(a[i] + " " + a[j] +" " + a[k]);
                        // ignoring duplicates
                        while(j < k && a[j] == a[j+1]) j++;
                        while(j < k && a[k] == a[k-1]) k--;
                        j++;
                        k--;
                    }else if(a[j] + a[k] < tar){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
    }
}
