public class Solution {

	public static Node kReverse(Node head, int k) {
		//base case
        if(head==null)
        return null;
        //initilize values for reversing a LL upto k
        Node previous=null;
        Node current =head;
        Node next=null;
        int count=0;
        
        while(current !=null && count<k)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
            count++;
        }
        if(next != null)
        {
            head.next=kReverse(next, k);
        }
        return previous;

	}
}
