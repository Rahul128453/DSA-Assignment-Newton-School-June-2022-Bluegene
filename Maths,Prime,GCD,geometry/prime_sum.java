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
            int l = inputTaker.nextInt();
            int r = inputTaker.nextInt();
            System.out.println(getPrimeDigitSum(l,r));
            t--;
        }
    }

    public static int getPrimeDigitSum(int l, int r){
        int sum = 0;
        for(int i = l; i<=r ; i++){
            if(checkPrime(i)){
                sum += (i%100)/10;
            }
        }
        return sum;
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