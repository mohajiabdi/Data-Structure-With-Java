package MergingArrayOFStack;

import ArraysOfStack.ArrayStack;

public class MergingArrayStack {
        private int[] stack;
        private int top;

        // Constructor to initialize stack with a specified capacity
        public MergingArrayStack(int capacity) {
            stack = new int[capacity];
            top = -1;
        }

        // Push an element onto the stack
        public void push(int value) {
            if (top == stack.length - 1) {
                System.out.println("Stack Overflow");
            } else {
                stack[++top] = value;
            }
        }

        // Pop an element from the stack
        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1; // Return -1 for an empty stack
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
            return top;
        }

        // Merge two stacks into a new stack
        public static MergingArrayStack mergeStacks(MergingArrayStack stack1, MergingArrayStack stack2) {
            int newCapacity = stack1.size() + stack2.size();
            MergingArrayStack mergedStack = new MergingArrayStack(newCapacity);

            // Add elements from stack1 to mergedStack
            for (int i = 0; i <= stack1.top; i++) {
                mergedStack.push(stack1.stack[i]);
            }

            // Add elements from stack2 to mergedStack
            for (int i = 0; i <= stack2.top; i++) {
                mergedStack.push(stack2.stack[i]);
            }

            return mergedStack;
        }

        // Display stack elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                for (int i = 0; i <= top; i++) {
                    System.out.print(stack[i] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            MergingArrayStack stack1 = new MergingArrayStack(5);
            MergingArrayStack stack2 = new MergingArrayStack(5);

            // Push elements to stack1
            stack1.push(1);
            stack1.push(2);
            stack1.push(3);

            // Push elements to stack2
            stack2.push(4);
            stack2.push(5);

            System.out.println("Stack 1:");
            stack1.display();
            System.out.println("Stack 2:");
            stack2.display();

            // Merge stacks
            MergingArrayStack mergedStack = mergeStacks(stack1, stack2);

            System.out.println("Merged Stack:");
            mergedStack.display();
        }
    }


