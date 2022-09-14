class Queue
{
 private Node front, rear; 
 private int currentSize;
 
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
       
    }
}
    
 public Queue()
 {
 front = null;
 rear = null;
 currentSize = 0;
 }
 
 
 public void dequeue()
 {
//enter your code here
    if(front == null){
        return;
    }else if(front.next == rear.next){
        front = null;
        rear = null;
    }else{
        front = front.next;
    }
    currentSize--;
 }
 

 public void enqueue(int data)
 {
 //enter your code here
    Node newNode = new Node(data);
    if(front == null){
        front = newNode;
        rear = newNode;
    }else{
        rear.next = newNode;
        rear = rear.next;
    }
    currentSize++;
 }
 
 public void displayfront(){
     //enter your code here
     if(front == null){
        System.out.println("0");
     }else{
         System.out.println(front.val);
     }
 }
}