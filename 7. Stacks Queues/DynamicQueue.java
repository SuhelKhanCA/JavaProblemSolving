public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];
            // copy all the previous elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        super.insert(item);
        return true;
    }
    
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue();
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
        
        queue.insert(10);
        queue.insert(20);
        queue.insert(32);
        queue.insert(65);

        queue.insert(10);
        queue.insert(20);
        queue.insert(32);
        queue.insert(65);
        queue.display();
    }
}
