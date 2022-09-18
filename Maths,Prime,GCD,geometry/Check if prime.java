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
            if(checkPrime(n)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            t--;
        }
    }


    public static boolean checkPrime(int n){

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;

    }
}