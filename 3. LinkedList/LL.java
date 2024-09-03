
public class LL {

    public Node head;
    public Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // Insert at First Position
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }

        size++;

    }

    // Insertion at Last Position ----O(1)
    public void insertLast(int val) {
        if (tail==null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }
    
    // public void insertLast(int val) { // -----> O(n)
    //     if (tail==null) {
    //         insertFirst(val);
    //     }
    //     Node node = new Node(val);
    //     temp = head;
    //     while (temp.next != null) {
    //         temp = temp.next;
    //     }
    //     temp.next = node;
    //     tail = node;
    //     size++;
    // }

    // insertion at Particular position
    public void insertAtPosition(int val, int position) {
        if (position==0) {
            insertFirst(val);
            return;
        }
        if (position == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);

        temp.next = node;

        size++;

    }    

    // Printing LinkedList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            System.out.print(" => ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Deletion at first or front
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }
    
    // Deletion at end
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
            }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        // System.out.println(prev.val);
        prev.next = null;
        tail = prev;
        size--;
    }
    
    // Deletion at given position
    public void deleteAtPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            deleteFirst();
            return;
        }
        if (position == size - 1) {
            deleteLast();
            return;
        }
        
        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        size--;
    }
    
    // Merging of Two linkedlist
    public void merge(Node head1, Node head2) {
        if (head1 == null) {
            head = head2;
            tail = getTail(head2);
            size = calculateSize(head2);
            return;
        }
        if (head2 == null) {
            head = head1;
            tail = getTail(head1);
            size = calculateSize(head1);
            return;
        }
    
        // Find the end of the first list
        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        // Append the second list to the end of the first list
        temp.next = head2;
    
        // Update tail and size
        tail = getTail(head1);
        size = calculateSize(head1);
    }
    
    private Node getTail(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        return current;
    }
    
    private int calculateSize(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    
    // Find
    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;        
        }
        return node;
    }
    // get value at index/position
    public int getValueAt(int index) {
        Node node = head;
        int count = 0;
        while (node != null) {
            if (count == index) {
                return node.val;
            }
            count++;
            node = node.next;
        }
        return Integer.MAX_VALUE;    
    }    
}