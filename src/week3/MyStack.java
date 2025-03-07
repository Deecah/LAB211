package week3;


import java.util.Stack;

public class MyStack {

    Stack<Integer> stack = new Stack<>();

    public MyStack() {
    }

    public MyStack(int stackValues) {
    }

    public void push(int stackValues) {
        stack.push(stackValues);
    }

    public void pop() {
        System.out.println(stack.pop());
    }

    public void get(int position) {
        System.out.println(stack.get(position));
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < list.length; i++) {
            myStack.push(list[i]);
        }
        myStack.pop();
        myStack.pop();
        for (int i = 0; i < 3; i++) {
            myStack.get(i);
        }
    }

}