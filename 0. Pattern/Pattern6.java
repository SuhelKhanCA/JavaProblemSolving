
class Pattern6{
    public static void main(String[] args) {
        
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("1 ");
        //     }
        //     System.out.println();
        // }
        // for(int i=3; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("1 ");
        //         }
        //         System.out.println();
        // }

        
        int n = 7;
        for (int i = 1; i <= n; i++) {
            if(i<=4){
                for (int j = 1; j <= i; j++) {
                    System.out.print("1 ");
                }
            
            }else{
                for(int j=3; j>=(i - 4); j--){ // j=7 to j=i
                    System.out.print("1 ");
                }
                
            }
            System.out.println();
        }
         
    }

}