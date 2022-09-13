import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
            Scanner inputTaker = new Scanner(System.in);
            int n = inputTaker.nextInt(); 
            int[] arr = new int[n];

            for(int i=0;i<n;i++){

                arr[i]= inputTaker.nextInt();
                 if(arr[i] == 0){

                   arr[i] = -1;

                }
           }

              System.out.println(countSubarray(arr, n));

         }

         public static long countSubarray (int[] arr, int n){
               long count = 0;
               int sum = 0;
                HashMap<Integer, Integer> map = new HashMap<>();

            for (int i=0;i<n;i++){

           sum += arr[i];

              if(sum == 0){

               count++;

            }

        if (!map.containsKey(sum)){ 
              map.put(sum, 1);
          }else if(map.containsKey(sum)){
                count += map.get(sum);
                int freq = map.get(sum);
                 map.put(sum, freq + 1);
          }
            }

            return count;
         }
}