import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
     Scanner sc=new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = sc.nextInt();
     int total_marks = a+b+c+d;
     int percentage =  total_marks/4;
     System.out.println(percentage);

    }
}