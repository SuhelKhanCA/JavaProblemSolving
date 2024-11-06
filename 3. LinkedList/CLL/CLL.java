// package CLL;

public class CLL {
    private Node head;
    private Node tail;
    int size;

    public CLL() {
        this.size = 0;
    }

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // insert
    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }
    
    // display
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.print("HEAD = ");
        System.out.println(node.value);
    }

    public static void main(String[] args) {
        CLL list = new CLL();

        list.insertLast(23);
        list.insertLast(99);
        list.insertLast(54);
        list.insertLast(11);

        list.display();
    }
}
