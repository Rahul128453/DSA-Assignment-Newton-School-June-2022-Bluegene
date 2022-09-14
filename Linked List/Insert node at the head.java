public static Node addElement(Node head, int new_data) {
    //enter your code here
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    
        return head;
    
    }