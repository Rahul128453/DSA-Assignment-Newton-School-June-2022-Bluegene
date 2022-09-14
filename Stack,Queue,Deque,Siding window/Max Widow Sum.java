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
        
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = inputTaker.nextInt();
        }

        long sum = getMaxSumInWindow(arr,n,k);
        System.out.println(sum);
    }

    public static long getMaxSumInWindow(int[] arr, int n, int k){
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i =0;i<k;i++){

            while(!queue.isEmpty() && arr[i] > arr[queue.peekLast()]){
                queue.removeLast();
            }

            queue.addLast(i);
        }

        long result = 0;
        for(int i = k;i<n; i++){
            result += arr[queue.peekFirst()];

            while(!queue.isEmpty() && queue.peekFirst() <= i-k){
                queue.removeFirst();
            }

            while(!queue.isEmpty() && arr[i] > arr[queue.peekLast()]){
                queue.removeLast();
            }

            queue.addLast(i);
        }

        result += arr[queue.peekFirst()];
        return result;

    }
}