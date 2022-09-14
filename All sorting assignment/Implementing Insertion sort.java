import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner daskdjfk = new Scanner(System.in);
        int t = daskdjfk.nextInt();
        while(t > 0){
            int n = daskdjfk.nextInt();
            int[] arr = new int[n];

            for(int i = 0;i<n;i++){
                arr[i] = daskdjfk.nextInt();
            }
            performInsertionSort(arr, n);
            for(int i = 0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            t--;
        }
    }

    public static void performInsertionSort(int[] arr, int n){

        for(int i=1; i < n; i++){
            int keyToBeShifted = arr[i];
            int j = i -1;

            while( j>=0 && arr[j] > keyToBeShifted){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = keyToBeShifted;
        }
    }
}