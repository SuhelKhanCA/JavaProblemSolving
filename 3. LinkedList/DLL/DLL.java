// package DLL;

public class DLL {
    public Node head;
    public Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public class Node {
        int value;
        Node next;
        Node prev;

        Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        Node(int value) {
            this.value = value;
        }
    }
    
    // Insertion at First Position
    public void insertFirst(int value) {
        Node node = new Node(value);

        if (head == null && tail == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        node.next = head;
        head.prev = node;
        node.prev = null;

        head = node;
        size++;
    }

    // insert at last
    public void insertLast(int value) {
        Node node = new Node(value);

        if (tail == null || head == null) {
            head = tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.prev = tail;
        node.next = null;

        tail = node;
        size++;
    }
    
    // insert at any position

    public void insertAtIndex(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size - 1) {
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }

        node.next = tmp.next;
        node.prev = tmp;
        tmp.next = node;
        tmp.next.prev = node;
    }
    // find
    public Node find(int value) {
        Node node = head;

        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    // insert after a value
    public void insert(int after, int value) {
        Node p = find(after);
        if (p == null) {
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(value);
        
        node.next = p.next;
        node.prev = p;
        if (node.next != null) {
            p.next.prev = node;
        }
        p.next = node;
    }

    // Display method
    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.value + " <=> ");
            node = node.next;
        }
        System.out.println("END");
    }

    // reverse display
    public void displayReverse() {
        Node node = tail;

        while (node != null) {
            System.out.print(node.value + " <=> ");
            node = node.prev;
        }
        System.out.println("START");
    }


    // main method
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(23);
        list.insertFirst(98);
        list.insertFirst(14);
        list.insertFirst(22);
        list.insertFirst(33);

        list.display();
        // list.displayReverse();
        list.insertAtIndex(100, 2);
        list.display();

        list.insert(100, 99);
        list.display();
    }
}
