import java.util.*;
class SubArrays{
    public static int countCompleteSubarrays(int[] nums) {
        ArrayList<int[]> ls = new ArrayList<>();
        
        for(int i=0; i< nums.length; i++){
            for(int j=i; j< nums.length; j++){
                
                int[] subarray = new int[j-i+1];
                    for(int k=i; k<=j; k++){
                        subarray[k-i] = nums[k];
                    }
                ls.add(subarray);
            }
        }
        System.out.println("ArrrayList is: ");
        for(int i=0; i< ls.size(); i++){
            System.out.println(Arrays.toString(ls.get(i)));
        }
        return ls.size();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("No of sub-arrays: "+ countCompleteSubarrays(arr));
    }
}