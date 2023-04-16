 public  Node removeDuplicates() {
        if(head==null)
            return null;

        Node current =head;
        while(current != null)
        {
            Node temp=current.next;
            while(temp !=null) {
                if (temp.data == current.data) {
                    Node next = temp.next.next;
                    temp.next = next;
                } else
                    temp = temp.next;
            }
                current=current.next;
            }
            return head;
        }
