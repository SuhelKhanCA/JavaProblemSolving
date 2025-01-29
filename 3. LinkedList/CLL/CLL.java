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

    // insert first

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        node.next = head;
        tail.next = node;
        head = node;
        size++;
    }

    // insert last
    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }
    

    // insert any position

    public void insert(int position, int val) {
        if (position == 1) {
            insertFirst(val);
            return;
        }
        if (position == this.size) {
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        Node tmp = head;

        for (int i = 1; i < position - 1; i++) {
            if (tmp.next != null) {
                tmp = tmp.next;
            }
        }

        node.next = tmp.next;
        tmp.next = node;
    }

    // Delete first

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        tail.next = head;
    }

    // Deletion last

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node tmp = head;
        while (tmp.next != tail) {
            tmp = tmp.next;
        }
        tmp.next = head;
        tail = tmp;
    }

    // delete at any position

    public void delete(int position) {
        if (position == 1) {
            deleteFirst();
            return;
        }
        if (position == this.size) {
            deleteLast();
            return;
        }

        Node tmp = head;
        for (int i = 1; i < position - 1; i++) {
            tmp = tmp.next;
        }

        tmp.next = tmp.next.next;
    }

    // Delete Node

    public void deleteNode(int nodeVal) {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }


        Node tmp = head;
        if (tmp.value == nodeVal) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = tmp.next;
            if (n.value == nodeVal) {
                tmp.next = n.next;
                break;
            }
            tmp = tmp.next;
        } while (tmp != head);

    }
    
    // display
    public void display() {
        Node node = head;
        System.out.print("HEAD -> ");
        if (head != null) {
            do {
                System.out.print(node.value + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
        }
        System.out.print("HEAD");
        System.out.println();
    }

    public static void main(String[] args) {
        CLL list = new CLL();
      
        list.insertLast(54);
        list.insertLast(11);

        list.insertLast(100);
        list.insertLast(10);
        list.insertLast(200);
        list.insertLast(30);
        list.insertFirst(310);

        // System.out.println(list.size);

        list.insert(3, 10);

        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();
        
        list.delete(2);
        list.display();

        list.deleteNode(100);
        list.display();
    }
}
