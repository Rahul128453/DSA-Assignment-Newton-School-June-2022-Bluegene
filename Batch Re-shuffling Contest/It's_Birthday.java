import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             sc.nextLine();
             String str = sc.nextLine();
             int k =sc.nextInt();
             System.out.println(largesrAfterk(str,k,n));         
    }
    public static String largesrAfterk(String str,int k,int n){
        String result="";
        for(char i:str.toCharArray()){
            while(result.length()>0 && result.charAt(result.length()-1)<i && k>0){
                result =result.substring(0,result.length()-1);
                k--;
            }
            result+=i;
        }
        while(result.length()>0 && k>0){
            result=result.substring(0,result.length()-1);
            k--;
        }
        return result;
    }
}