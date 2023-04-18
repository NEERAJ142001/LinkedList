class Solution {

    public ListNode getmiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null &&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode Reverse(ListNode head)
    {
        ListNode current=head;
        ListNode next=null;
        ListNode previous=null;
        while(current !=null)
        {
            next=current.next;
            current.next=previous;

            previous=current;
            current=next;
        }
        return previous;
    } 
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        return true;
        ListNode middle=getmiddle(head);
        ListNode temp=middle.next;

        middle.next=Reverse(temp);

        ListNode head1=head;
        ListNode head2=middle.next;

        while(head2 != null)
        {
            if(head1.val != head2.val)
            {
                return false;
            }
            else
            {
                head1=head1.next;
                head2=head2.next;
            }
        }
        return false;       
    }
}
