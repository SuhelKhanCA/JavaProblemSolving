public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {5, 7, 4, 7, 4, 3, 4, 4, 7, 4, 4, 7, 4, 4};
        System.out.println("The Majority element is : " + findMajorityElement(arr, arr.length));
    }
    public static int findMajorityElement(int[] arr, int n){
        int candidate = arr[0];
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }else{
                count--;
            }

            if (count ==0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // verify if the candidate is your answer or not
        count = 0;
        for (int val : arr) {
            if (val == candidate) {
                count++;
            }
        }

        if (count > n/2) {
            return candidate;
        }else{
            return -1;
        }
    }
}
