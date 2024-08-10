package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println("Is target there in string: "+ search(name, target));
    }

    static boolean search(String str, char target){
        boolean flag = false;
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
