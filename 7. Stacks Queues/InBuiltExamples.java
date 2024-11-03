// import java.util.Stack;

import java.util.LinkedList;
import java.util.Queue;

class InBuiltExamples {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.add(1);
        // stack.add(2);
        // stack.add(3);
        // stack.add(4);
        // stack.add(5);

        // System.out.println(stack);

        // stack.pop();
        // stack.pop();
        // stack.pop();
        // System.out.println();
        // System.out.println(stack);

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q);

        q.poll();
        q.poll();
        System.out.println();
        System.out.println(q);
    }
}