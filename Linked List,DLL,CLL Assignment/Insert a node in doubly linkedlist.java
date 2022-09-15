public static Node insertnew(Node head,int k) {        
    Node newNode = new Node(k); //(null, k, null)


        // Code

        if(head==null){

            //list is empty

            head = newNode;

        }



        //if found in head

        else if(head.val>=newNode.val){

            newNode.next=head;

            newNode.next.prev=newNode;

            head=newNode;

        }

        else{

            //in other position

            Node temp=head;

            while(temp.next!=null && temp.next.val<newNode.val){

                temp=temp.next;

            }

            newNode.next=temp.next;

            if(temp.next!=null){

                //if temp is not the last Node

                newNode.next.prev=newNode;

            }

            temp.next=newNode;

            newNode.prev= temp;

        }

        return head;

}