public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
        }
        return slow;

    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    public boolean checkpallindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node MidNode = findMid(head);

        Node prev = null;
        Node curr = MidNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            } else {
                left = left.next;
                right = right.next;
            }
        }
        return true;

    }

    public static boolean iscycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if (slow == fast) {
            return true;
        }
        return false;

    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }
        return mergedLL.next;
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right 
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

    public void print() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.addFirst(7);

        ll.addLast(3);

        ll.addLast(9);
        // ll.print();
        ll.head = ll.mergesort(ll.head);
        ll.print();
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;

        // System.out.println(iscycle());

    }

}