import java.util.Stack;

class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
        System.out.println(stack);
    }
}