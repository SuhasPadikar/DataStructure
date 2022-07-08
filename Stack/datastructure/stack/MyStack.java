package datastructure.stack;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> stack;

    public MyStack() {
        stack = new ArrayList<Integer>();

    }

    public int push(Integer N) {
        stack.add(N);
        return 0;
    }

    public Integer pop() throws StackException{
        if (stack.size() == 0) {
            System.out.println("Stack is Empty");
            throw new StackException("Stack is Empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public Integer peek() {
        if (stack.size() == 0) {
            System.out.println("Stack is Empty");
        }
        return stack.get(stack.size() - 1);

    }

    public int size() {
        return stack.size();
    }

    public void display() {
        stack.stream().forEach(System.out::println);
    }


    public String toString() {
        return "" + stack.toString();
    }
}

