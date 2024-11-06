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
            return;
        }

        node.next = head;
        head.prev = node;
        node.prev = null;

        head = node;
    }

    // Display method
    public void diaplay() {
        Node node = head;

        while (node != null) {
            System.out.print(node.value + " <=> ");
            node = node.next;
        }
        System.out.println("END");
    }

    // reverse display
    public void diaplayReverse() {
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

        list.diaplay();
        list.diaplayReverse();
    }
}
