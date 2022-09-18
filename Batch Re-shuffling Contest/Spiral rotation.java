import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][] = new int[n][m];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    List<Integer> list = spiral(arr);
    for(int i = 0; i < list.size(); i++){
        System.out.print(list.get(i) + " ");
    }
    }
    public static List<Integer> spiral(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        if(arr.length==0){
            return ans;
        }
        int m = arr.length; int n = arr[0].length;
        boolean [][] seen = new boolean[m][n];
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};
        int x = 0, y = 0, di = 0;
        for(int i = 0; i < m*n; i++){
            ans.add(arr[x][y]);
            seen[x][y] = true;
            int cr = x+dr[di];
            int cc = y+dc[di];
            if(0 <= cr && cr < m && 0 <= cc && cc < n && !seen [cr][cc]){
                x = cr;
                y = cc;
            }
            else{
                di = (di + 1)%4;
                x +=dr[di];
                y +=dc[di];
            }
        } 
        return ans;
    }
}