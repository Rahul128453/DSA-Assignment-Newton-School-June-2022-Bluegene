import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = inputTaker.nextInt();
        }
           
        nextLarger(arr, n);
	}

    static void nextLarger(int arr[], int n)
    {
            Stack<Integer> stack = new Stack<>();
			for(int i=n-1;i>=0;i--)
			{
				int a = arr[i];

				while(!stack.empty() && stack.peek() <= a){
					stack.pop();
				}
				if(stack.empty()){
                    arr[i]=-1;
                }else{
                    arr[i] = stack.peek();
                }
				stack.push(a);
		    }

			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
	        }
    }
    
}