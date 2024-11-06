package LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class DequeLinkedList {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack Contents: "+ stack);
        System.out.println("Top Element: "+ stack.peek());
        int element = stack.pop();
        System.out.println("Element Popped: "+ element);
        System.out.println("Stack content after pop: "+ stack);
        System.out.println("Stack Size: "+ stack.size());
        System.out.println("Stack is Empty: "+ stack.isEmpty());
    }
}
