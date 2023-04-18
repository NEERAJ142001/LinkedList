class Solution {
    public void insertAtAnswer(ListNode tail,ListNode head,int digit)
    {
        ListNode temp=new ListNode(digit);
        if(head==null)
        {
            head=temp;
            tail=temp;
            return;
        }
        else
        {
            tail.next=temp;
            tail=temp;
        }
    }

    public ListNode sum(ListNode first,ListNode second)
    {
       
        int carry=0;
        ListNode head= null;
        ListNode tail=null;
        while(first != null || second != null ||carry !=0)
        {
            int val1=0;
            int val2=0;

            if(first!=null)
            val1=first.val;
            if(second!=null)
            val2=second.val;

            int sum=carry+val1+val2;
            int digit=sum%10;

            insertAtAnswer(tail,head,digit);

            carry=sum/10;
            
            if(first!=null)
            first=first.next;
            if(second!=null)
            second=second.next;
        }     
            return head;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
           l1=Reverse(l1);
           l2=Reverse(l2);

           ListNode answer= sum(l1,l2);
           answer=Reverse(answer);
           return answer;

    }
}
