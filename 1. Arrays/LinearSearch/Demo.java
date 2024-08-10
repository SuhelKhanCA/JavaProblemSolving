package LinearSearch;

public class Demo {

    public static boolean ifFound(int a[], int target){
        boolean flag = false;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i]== target) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[] = {18, 12, 9, 14, 77, 50};
        int target = 16;

        System.out.println("Is there is array: " + ifFound(arr, target));
    }
}
