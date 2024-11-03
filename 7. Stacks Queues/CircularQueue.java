public class CircularQueue {
    int[] data;
    int front = 0;
    int end = 0;
    int size = 0;
   private static final int DEFAULT_SIZE = 10;

   public CircularQueue(int size) {
       data = new int[size];
   }

   public CircularQueue() {
       this(DEFAULT_SIZE);
   }

   public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // insert
    public boolean insert(int item) {
        if (this.isFull()) {
            System.out.println("Queue overflow");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    // remove
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    
    // print
    public void display() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return;
        }
        // for (int i = front; i < end; i++) {
        //     System.out.print(data[i] +" ");
        // }
        int i = front;
        do{
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;
        } while (i != end);
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue();

        queue.insert(12);
        queue.insert(10);
        queue.insert(20);
        queue.insert(32);
        queue.insert(65);
        
        queue.display();
        
        queue.remove();
        queue.insert(133);
        System.out.println("\nAfter removing item");
        queue.display();
    }
}
