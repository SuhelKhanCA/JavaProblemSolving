public class CustomQueue {
    int[] data;
    int end = 0;
    private static final int DEFAULT_SIZE = 10;
    
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    // insert
    public boolean insert(int item) {
        if (this.isFull()) {
            System.out.println("Queue overflow");
            return false;
        }
        data[end++] = item;
        return true;
    }

    // delete
    public int remove() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    // print
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] +" ");
        }
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue();

        queue.insert(12);
        queue.insert(10);
        queue.insert(20);
        queue.insert(32);
        queue.insert(65);

        queue.display();
        
        queue.remove();
        System.out.println("\nAfter removing item");
        queue.display();
    }

}
