import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();
        
        int[][] arr = new int[n][n];

        for(int i =0; i<n; i++){
            
            for(int j =0; j<n; j++){

                arr[i][j] = inputTaker.nextInt();

            }
        }

        int sumOfPrimaryDiagonal = 0;
        int sumOfSecondaryDiagonal = 0;

        for(int i =0; i<n; i++){
            
            for(int j =0; j<n; j++){

                if( i == j){
                    sumOfPrimaryDiagonal += arr[i][j];
                }

                if( i + j == n-1){
                    sumOfSecondaryDiagonal += arr[i][j];
                }

            }
        }

        System.out.println(sumOfPrimaryDiagonal + " " + sumOfSecondaryDiagonal);
    }
}