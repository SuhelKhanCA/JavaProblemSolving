// https://leetcode.com/problems/defanging-an-ip-address/
import java.util.Arrays;
class Solution {
   public String defangIPaddr(String address) {
        
        // String[] strArr = address.split("\\.");

        // String str = "";
        // for(int i=0; i< strArr.length - 1; i++){

        //     str = str + strArr[i] + "[.]";
        // }
        // str = str + strArr[strArr.length - 1] ;

        // return str;
        return address.replaceAll("\\.", "[.]");
    }
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.defangIPaddr("1.1.1.1"));
    }
}