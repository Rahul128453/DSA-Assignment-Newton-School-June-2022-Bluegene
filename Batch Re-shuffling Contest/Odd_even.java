import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
       switch(n%2){
            case 0:
                System.out.println("Even");
                 break;
            case 1:
            System.out.println("Odd");
            break;
    }
}
}