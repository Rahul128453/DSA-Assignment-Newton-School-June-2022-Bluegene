/*
 static Stack<Integer> s1 = new Stack<Integer>();  
 static Stack<Integer> s2 = new Stack<Integer>();  
*/
  
   
static void enQueue(int x)  
{  
  //Enter your code here
    while(!s1.isEmpty()){
      s2.push(s1.pop());
    }

    s1.push(x);

    while(!s2.isEmpty()){
      s1.push(s2.pop());
    }

}  

static void deQueue()  
{   
 //Enter your code here
    s1.pop();
} 
static void Print1(){
  // Enter your code here
    int x = s1.peek();
    System.out.println(x);
}