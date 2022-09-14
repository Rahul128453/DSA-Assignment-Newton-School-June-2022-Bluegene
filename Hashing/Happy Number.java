import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner inputTaker = new Scanner(System.in);
         int n = inputTaker.nextInt();

         System.out.println(isHappy (n));

         }

       public static boolean isHappy(int n){
              HashMap<Integer, Boolean> map = new HashMap<>();

          while(n != 1 && !map.containsKey(n)){
               map.put(n, true);

            n = getNextNumber(n);

         }
          if(n == 1){

          return true;

       }
       return false;

    } 
   public static int getNextNumber(int n){

       int sum =0;
        while(n>0){
         int x = n%10;
         n = n/10;
         sum += (x*x);

        }

      return sum;

     }
}