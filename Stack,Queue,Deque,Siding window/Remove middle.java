public static Stack<Integer> deleteMid(Stack<Integer> s, int N)
    {
      //Enter your code here
        return deleteMidRecursve(s, N, 0);
    }


    public static Stack<Integer> deleteMidRecursve(Stack<Integer> s, int n, int count)
    {
      //Enter your code here
        if(count == n/2){
          s.pop();
          return s;
        }

        int x = s.peek();
        s.pop();
        count++;

        s = deleteMidRecursve(s, n, count);
        s.push(x);
        return s;
    }