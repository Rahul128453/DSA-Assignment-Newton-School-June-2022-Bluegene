import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i]=sc.nextInt();
    }
    int sum = 0;
    for(int i = 0; i < n; i++){
        sum = sum + arr[i];
        if(i + 1 <= a){
            System.out.print(sum/(i+1)+" ");
        }
        else{
            sum = sum - arr[i-a];
            System.out.print(sum/a + " ");
        }
    }
    }
}