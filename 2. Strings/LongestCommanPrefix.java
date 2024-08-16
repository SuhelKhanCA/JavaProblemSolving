class LongestCommanPrefix{ // Not correct
    public static String longestCommonPrefix(String[] strs) {
        String str = "";
        String st = strs[0];
            for (int ch = 0; ch < st.length(); ch++) {
                for(int i=0; i< strs.length; i++){
                    if(st.charAt(i) == strs[i].charAt(i)){
                        str = str + String.valueOf(st.charAt(i));
                    }else{
                        continue;
                    }    
                }
                break;
            }
            return str;  
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}