import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
           Scanner inputTaker = new Scanner(System.in);
           int t = inputTaker.nextInt();
           while(t>0){
               int n = inputTaker.nextInt();
               int[] arr = new int[n];
               for(int i =0;i<n;i++){
                   arr[i] = inputTaker.nextInt();
               }
               System.out.println(getMaxContinuoseSum(arr,n));
               t--;
           }           
    }

      public static long getMaxContinuoseSum(int[] arr, int n){
          long result = Integer.MIN_VALUE;
          long current_sum=0;
          
          for(int i = 0;i<n;i++){
              current_sum+= arr[i];

              if (result < current_sum){
                  result = current_sum;
              }
              if(current_sum<0){
                  current_sum = 0;
              }
          }
          return result;

      }
}
