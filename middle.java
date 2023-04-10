public class Solution {
// second method
    public static Node middle(Node head)
    {
        Node slow=head;
        Node fast=head.next;

        if(head==null)
        return null;
        if(head.next==null)
        return head;
        if(head.next.next==null)
        return head.next;

        while(fast != null)
        {
            fast=fast.next;
            if(fast!=null)
            {
                fast=fast.next;
            }
            slow=slow.next;
            
        }
        return slow;
    }
    //first method
    public static int length(Node head)
    {
        int length=0;
        Node current =head;
        while(current !=null)
        {
            length++;
            current=current.next;
        }
        return length;
    }

    public static Node findMiddle(Node head) 
    {
        // second method
        return middle(head);
        //first method
        int ans=length(head);
        int x=ans/2;
        int count=0;
        Node temp=head;
        while(count<x)
        {
        temp=temp.next;
        count++;
        }
        return temp;
    }
}
