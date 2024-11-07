package LinkedList;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedStack<String> names = new LinkedStack<String>();

        names.push("John");
        names.push("Rob");
        names.push("Lisa");
//        names.push("Asho");
//        names.push("Ali");
//        names.push("Adan");

        System.out.println("Orignal Stack: ");
        names.printStack();

        names.retainFirstAndLast();
        System.out.println("\nStack after retaining first and last elements: ");
        names.printStack();

    }
}
