import java.util.*;
public class creation {
    private Node head;
    private Node tail;
    public int size;
    private creation()
    {
        this.size=0;
    }
    public void insertf(int data)
    {
      
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size+=1;
    }
    public void insertlast(int data)
    {
       if(tail==null)
       {
        insertf(data);
        return;
       }
       Node node=new Node(data);
       tail.next=node;
       size+=1;  

    }
    public void insert(int data,int index)
    {
        if(index==0)
        {
            insertf(data);
        }
        if(index==size)
        {
            insertlast(data);
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
            
        }
        Node node=new Node(data,temp.next);
        temp.next=node;
        size+=1;
        
        

    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int data;
        private Node next;
        public Node(int data)
        {
            this.data=data;
        }
        public Node(int data,Node next)
        {
            this.data=data;
            this.next=next;
        }

    
        
    }
    public static void main(String[] args) {
        creation creation = new creation();
        creation.insertf(4);
        creation.insertf(42);
        creation.insertlast(10);
        creation.display();
    }
}
