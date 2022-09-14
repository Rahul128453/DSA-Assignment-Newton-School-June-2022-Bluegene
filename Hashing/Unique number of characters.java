import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
String str = sc.nextLine();

HashMap<Character, Integer> map = new HashMap<>();
for(int i=0;i<str.length();i++){
Character ch = str.charAt(i);
map.put(ch, 1);
}
System.out.println(map.size());
    }
}