import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner inputTaker = new Scanner(System.in);

        int n = inputTaker.nextInt();
        int k = inputTaker.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {

            arr[i] = inputTaker.nextLong();
        }

        int i = 0;
        int p = (int)Math.ceil(k/2.0);
        // System.out.println(p);
        int j = (n - p);
        long pref = arr[i];
        long suf = arr[j];       

        while (i < p && j < n ) {

            pref = Math.min(pref, arr[i]);
            suf = Math.max(suf, arr[j]);
            
            i++; j++;
        }
        // System.out.println(pref);
        // System.out.println(suf);
        if (pref != suf) {

            System.out.println("NO");
        }
        else {

            System.out.println("YES");
        }
    }
}