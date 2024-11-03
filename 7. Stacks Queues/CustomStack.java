public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    
    // push()
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    // isFull
    private boolean isFull() {
        return ptr == data.length - 1; // ptr is pointing at the last index      
    }

    // pop()

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        int itemRemoved = data[ptr];
        data[ptr] = 0;
        ptr--;
        return itemRemoved;
    }
    
    // isEmpty()

    private boolean isEmpty() {
        if (this.ptr == -1) {
            return true;
        } else {
            return false;
        }
    }
    // peek()

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        return data[ptr];
    }
    // print stack
    void printStack() {
        for (int i = 0; i <= this.ptr; i++) {
            System.out.println(data[i]);
        }
    }
    // main method
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(10);
        stack.push(20);
        stack.push(44);
        stack.push(65);
        stack.push(85);
        stack.push(25);
        stack.push(57);

        stack.printStack();
        System.out.println();

        stack.pop();
        System.out.println();
        stack.printStack();
    }
}