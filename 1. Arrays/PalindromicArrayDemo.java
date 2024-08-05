package Arrays;

//{ Driver Code Starts
    import java.util.*;
    class PalindromicArray{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0 ;i < n; i++)
                    a[i]=sc.nextInt();
                GfG g = new GfG();
                System.out.println(g.palinArray(a , n));
            }
        }
    }
    // } Driver Code Ends
    
    
    /*Complete the Function below*/
    class PalindromicArrayDemo
    {
        public static int palinArray(int[] a, int n)
               {
                      //add code here.
                      int ans = 1;
                for(int i=0; i< n-1; i++){
                    int rev = 0;
                    int num = a[i];
                    while(a[i] != 0){
                        int r = a[i] % 10;
                        a[i] = a[i]/10;
                        rev = 10* rev + r;
                    }
                    if(num != rev){
                        ans = 0;
                        break;
                    }
                }
                return ans;
               }
    }