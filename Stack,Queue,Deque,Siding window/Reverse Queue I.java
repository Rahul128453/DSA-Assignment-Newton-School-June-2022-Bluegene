class Solution{
    public void reverseQueue(Queue<Integer> Q){

        if(Q.isEmpty())return;

        int x = Q.peek();

        Q.remove();

        reverseQueue(Q);

        Q.add(x);
       
    }
}