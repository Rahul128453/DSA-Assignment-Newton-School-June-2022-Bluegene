
public static Node deleteElement(Node head,int k) {
    Node left = head;
    Node right = head;
    while(k-- > 0){
        right = right.next;
    }
    if(right == null){
        left = left.next;
        return left;
    }
    while(right.next != null){
        left = left.next;
        right = right.next;
    }
    if(left.next.next == null){
        left.next = null;
        return head;
    }
    left.next = left.next.next;
    return head;
     }