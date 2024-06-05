public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static int size;
    public static Node tail;
    // add
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
           head=tail=newNode;
           return;
            
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //remove
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
           return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }
    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(5);
         dll.addFirst(4);
          dll.addFirst(7);
           dll.addFirst(8);
            dll.addFirst(9);
            dll.print();
            System.out.println(dll.size);
            dll.removeFirst();
            dll.print();
        
    }
}
