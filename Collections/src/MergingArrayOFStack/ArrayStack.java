package MergingArrayOFStack;

public class ArrayStack<T> {
    private T[] stack;
    private int top;

    // Constructor to initialize stack with a specified capacity
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    // Push an element onto the stack
    public void push(T value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    // Pop an element from the stack
    public T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null; // Return null for an empty stack
        } else {
            return stack[top--];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    // Merge two stacks into a new stack with combined pairs
    public static ArrayStack<String> mergeNameStacks(ArrayStack<String> firstNames, ArrayStack<String> lastNames) {
        int size = Math.min(firstNames.size(), lastNames.size()); // Ensures matching pairs
        ArrayStack<String> fullNames = new ArrayStack<>(size);

        // Create full names from first and last names
        for (int i = 0; i < size; i++) {
            String firstName = firstNames.stack[i];
            String lastName = lastNames.stack[i];
            fullNames.push(firstName + " " + lastName);
        }

        return fullNames;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        ArrayStack<String> firstNames = new ArrayStack<>(3);
        ArrayStack<String> lastNames = new ArrayStack<>(3);

        // Push first names to stack
        firstNames.push("John");
        firstNames.push("Rob");
        firstNames.push("Alexa");

        // Push last names to stack
        lastNames.push("Doe");
        lastNames.push("June");
        lastNames.push("Gates");

        System.out.println("First Names Stack:");
        firstNames.display();
        System.out.println("\nLast Names Stack:");
        lastNames.display();

        // Merge first and last name stacks
        ArrayStack<String> fullNames = mergeNameStacks(firstNames, lastNames);

        System.out.println("\nFull Names Stack:");
        fullNames.display();
    }
}
