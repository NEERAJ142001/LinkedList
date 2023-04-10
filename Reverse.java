public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
		if(head==null || head.next==null)
			return head;
		
        LinkedListNode previous=null;
		LinkedListNode current=head;
		LinkedListNode forward=null;
		while(current != null)
		{
		forward=current.next;
		current.next=previous;

		previous=current;
		current=forward;
		}

		return previous;
    }
}
