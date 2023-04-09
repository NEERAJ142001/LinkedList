import org.w3c.dom.Node;

import java.util.LinkedList;

public class linkedList_Basic {
    int size=0;
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data) {
        //create a new node
        Node s=new Node(data);
        //checking list is empty or not
        if(head==null) {
            head=s;
            size++;
            return;
        }
        //adding element on first place
        s.next=head;
        head=s;
        size++;
    }
    public void addLast(String data) {
        //creating new node
        Node s = new Node(data);
        //checking list is empty or not
        if (head == null) {
            head = s;
            size++;
            return;
        }
        Node currentNode = head;
        //traversing to the last node
        while (currentNode.next != null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next =s;
        size++;
    }
    public void insertInMiddle(int position,String data)
    {
        if(position==1)
        {
            addFirst(data);
            return;
        }
        if(head.next==null)
        {
            addLast(data);
            return;
        }
        Node temp=head;
        int count=1;
        while(count<position-1)
        {
            temp=temp.next;
            count++;
        }
        Node x=new Node(data);
        x.next=temp.next;
        temp.next=x;

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
    public void deleteFirst()
    {
        if(head==null) {
            System.out.println("empty");
            size--;
            return;
        }
        head=head.next;
        size--;
    }
    public void deleteLast()
    {
        if(head==null) {
            System.out.println("empty");
            size--;
            return;
        }
        size--;
        if(head.next ==null)
        {
            size--;
            head=null;
            return;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while (lastNode.next !=null)
        {
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }
    public void deleteInMiddle(int position)
    {
        if(position==1) {
            deleteFirst();
            return;
        }
        if(head.next==null)
        {
            deleteLast();
            return;
        }
        Node temp=head;
        int count=1;
        while(count<position-1)
        {
            temp=temp.next;
            count++;
        }

        Node current=temp.next;
        temp.next=current.next;

    }
    public int getSize()
    {
        return size;
    }
    public static void main(String[] args) {
        linkedList_Basic list=new linkedList_Basic();
        list.addFirst("name");
        list.addFirst("my");
        list.addLast("is");
        list.addLast("neeraj");
        list.addLast("varshney");
        list.print();
        System.out.println();

        list.deleteFirst();
        list.print();
        System.out.println();
        list.deleteLast();
        list.print();
        System.out.println();
        System.out.println(list.getSize());

        list.insertInMiddle(2,"neerajjj");
        list.print();
        System.out.println();

        list.deleteInMiddle(1);
        list.print();

    }
}
