package LinkedList;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter strings to push onto the stack (type 'exit' to finish):");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            stack.push(input);
            //System.out.println("Pushed: " + input);
        }

        System.out.println("\nCurrent Stack (top to bottom):");
        try {
            stack.printStack();
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty.");
        }

        // Optional: Demonstrate pop and peek
        System.out.println("\nPopping elements from the stack:\n");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        scanner.close();
    }
}
