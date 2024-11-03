public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];
            // copy all the previous elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // ptr++;
        // data[ptr] = item;
        super.push(item);
        return true; 
    }
    // isFull
    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
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

        stack.push(25);
        stack.push(57);
        
        stack.printStack();
        System.out.println();
        
        stack.push(547);
        stack.push(855);
        stack.push(14);
        stack.push(967);
        stack.push(5);
        stack.push(7);
        stack.push(507);
        System.out.println();
        stack.printStack();
    }
}
