public class Double_LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node previous;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            this.previous=null;
        }
    }
    public void insertAtFirst(String data)
    {
        //create a new node
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
            return;
        }
        temp.next=head;
        head.previous=temp;
        head=temp;
    }
    public void insertAtLast(String d)
    {
        Node temp=new Node(d);
        if(head==null)
        {
            head=temp;
            return;
        }
        Node currentNode=head;
        while (currentNode.next != null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=temp;
        temp.previous=currentNode;
    }
    public void insertAtAnyPosition(int position,String d)
    {
        Node data=new Node(d);
        if(position==1) {
            insertAtFirst(d);
            return;
        }
        if(head.next==null) {
            insertAtLast(d);
            return;
        }
        Node temp=head;
        int count=1;
        while(count<position-1)
        {
            temp=temp.next;
            count++;
        }
        data.next=temp.next;
        temp.next.previous=data;
        temp.next=data;
        data.previous=temp;

    }
    public void print()
    {
        if(head==null)
            System.out.print("empty");
        Node currentNode = head;
        while (currentNode != null)
        {
            System.out.print(currentNode.data +"->");
            currentNode=currentNode.next;
        }
        System.out.print("null");
    }
    public void deleteAtFirst()
    {
        if(head==null) {
            System.out.println("empty");
        }
        else {
            Node temp = head;
            temp.next.previous = null;
            head = temp.next;
            temp.next = null;
        }
    }
    public void deleteAtLast()
    {
        if(head==null)
            System.out.println("empty");
        Node temp=head;
        Node previous = null;
        while (temp.next != null)
        {
            previous=temp;
            temp=temp.next;
        }
        temp.previous=null;
        previous.next=temp.next;
        temp.next=null;
    }
    public void deleteAtAnyPosition(int position) {
        {
            if (position == 1) {
                deleteAtFirst();
                return;
            }
            if (head.next == null) {
                deleteAtLast();
                return;
            }
            Node current =head;
            Node previous=null;
            int count = 1;
            while (count < position) {
                previous=current;
                current=current.next;
                count++;
            }
            current.previous=null;
            previous.next=current.next;
            current.next=null;
        }
    }
    public static void main(String[] args) {
        Double_LL w=new Double_LL();
        w.insertAtFirst("neeraj");
        w.print();
        System.out.println();

        w.insertAtFirst("varshney");
        w.print();
        System.out.println();

        w.insertAtLast("varshneyjjjj");
        w.print();
        System.out.println();

        w.insertAtLast("apple");
        w.print();
        System.out.println();

        w.insertAtLast("mango");
        w.print();
        System.out.println();

        w.insertAtAnyPosition(2,"abc");
        w.print();
        System.out.println();

        w.deleteAtFirst();
        w.print();
        System.out.println();

        w.deleteAtLast();
        w.print();
        System.out.println();

        w.deleteAtLast();
        w.print();
        System.out.println();

        w.deleteAtAnyPosition(2);
        w.print();
    }
}
