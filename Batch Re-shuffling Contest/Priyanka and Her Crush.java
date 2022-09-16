import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner str  = new Scanner(System.in);
        int q = str.nextInt();
        str.nextLine();
        while(q>0){
            String s = str.nextLine();
            int count = 0;
            for(int i=0;i<s.length()/2;i++)
            count += Math.abs(s.charAt(i)-s.charAt(s.length()-1-i));
            System.out.println(count);
            q--;
        }              
    }
}