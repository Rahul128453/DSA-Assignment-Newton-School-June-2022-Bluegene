public static Node MakeCircular(Node head) {
//enter your code here
Node s=head;
while(s.next!=null)
s=s.next;
s.next=head;
return head;
}