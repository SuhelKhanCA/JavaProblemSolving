/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        LL list  = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(22);
        list.insertFirst(11);
        list.insertFirst(100);
        list.insertLast(99);
        list.insertAtPosition(544, 3);
        list.printList();

        System.out.println("\n==========Deletion=========\n");
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteAtPosition(2);
        list.printList();

        // Merging
        System.out.println("\n=======Merge=======");
        LL list2 = new LL();
        list2.insertFirst(5);
        list2.insertFirst(4);
        
        System.out.println("\n=======Second List=========\n");
        list2.printList();

        LL mergedList = new LL();

        mergedList.merge(list.head, list2.head);
        // mergedList.printList(); ---> END
        System.out.println("\n==========Merged LinkedList==========\n");
        list.printList();
        
        System.out.println(list.getValueAt(123));
    }
}