import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here   
         Scanner inputTaker = new Scanner(System.in);
        int q = inputTaker.nextInt();
        // method-1 -> using deque
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < q; i++) {
            int t = inputTaker.nextInt();
            // add Last
            dq.offerLast(t);
            while (dq.peekFirst() < (t - 3000)) {
                // poll first/ deque
                dq.removeFirst();
            }
            System.out.print(dq.size() + " ");
        }
    }
}