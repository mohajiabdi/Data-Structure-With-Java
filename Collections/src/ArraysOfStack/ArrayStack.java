package ArraysOfStack;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStack <T> {
    private final static int DEFAUL_CAPACITY =2;
    private int top;
    T[] stack,merged;

    public ArrayStack(int initial_Capacity){
        this.top = 0;
        stack = (T[])(new Object[initial_Capacity]);
        merged = (T[])(new Object[initial_Capacity]);

    }

    public ArrayStack(){
        this(DEFAUL_CAPACITY);
    }


    // make size method
    int Size(){
        return this.top;
    }

    //make IsEmpty method
    boolean isEmpty(){
        return this.top == 0;
    }

    //make Push method
    void push(T item){
        if(this.top == stack.length){
            resize();

        }

        stack[top++] = item;
    }

    //make Pop method
    T pop(){
        if(this.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }

        return stack[--top];
    }

    // make Peek method
    T peek(){
        if(this.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return stack[this.top - 1];
    }
    //display stack
//    void display(){
//        for(int i=this.top-1; i >= 0; i--){
//            System.out.print(stack[i] + " ");
//        }
//        System.out.println();
//    }

    private void resize() {
        // Double the capacity of the current stack
        int newCapacity = stack.length * 2;

        // Create a new array with double the size
        T[] newStack = (T[]) new Object[newCapacity];

        // Use System.arraycopy to copy elements from the old array to the new array
        System.arraycopy(stack, 0, newStack, 0, top);

        // Replace the old array with the new array
        stack = newStack;
    }

    // Assignment

    //IsFull Method
    boolean isFull(){
        return top == stack.length;
    }

    //GetCapacity
    int getCapacity(){
        return stack.length;
    }

    //Display from Top to down
    void display(){
        for(int i=this.top-1; i >= 0; i--){
            System.out.print("\"" + stack[i] + "\"\t");
        }
        System.out.println();
    }

    void find(String element){
        int count =0;
        for(int i = 0; i< top; i++){
            if(stack[i] == element)
              count++;
        }

//        if(count ==0){
//                System.out.println("\nNot Found!!");
//        }else{
//        System.out.println();
//        System.out.println(element + " is Found \'"+ count + "\' Times" );
//    }
        System.out.println();
        System.out.println(count == 0? "Not Found!!!":
                element+" is Found \'"+ count+"\' Times");
}



//    public ArrayStack<Integer> Total(ArrayStack<Integer> stack1, ArrayStack<Integer> stack2) {
//        if (stack1.top != stack2.top) {
//            throw new IllegalArgumentException("Both stacks must have the same size");
//        }
//
//        ArrayStack<Integer> result = new ArrayStack<>(stack1.getCapacity());
//        for (int i = 0; i < stack1.top; i++) {
//            int mid = (int)stack1.stack[i];
//            int finale = (int)stack2.stack[i];
//            result.push(mid + finale);
//        }
//
//        return result;
//    }


    public ArrayStack<Integer> totalInt1(ArrayStack<Integer> stack1, ArrayStack<Integer> stack2) {
        if (stack1.Size() != stack2.Size()) {  // Assume there's a size() method
            throw new IllegalArgumentException("Both stacks must have the same size");
        }

        ArrayStack<Integer> result = new ArrayStack<>(stack1.getCapacity());
        int size = stack1.Size(); // Get the actual size of the stacks

        // Create temporary stacks to preserve the original stacks
        ArrayStack<Integer> temp1 = new ArrayStack<>(size);
        ArrayStack<Integer> temp2 = new ArrayStack<>(size);

        // Transfer elements to temporary stacks to avoid modifying the originals
        for (int i = 0; i < size; i++) {
            temp1.push(stack1.pop());
            temp2.push(stack2.pop());
        }

        // Sum the elements and push to the result stack
        for (int i = 0; i < size; i++) {
            int mid = temp1.pop();
            int finale = temp2.pop();
            result.push(mid + finale);
        }

        return result;
    }



    public ArrayStack<Integer> totalInt(ArrayStack<Integer> stack1, ArrayStack<Integer> stack2) {
        if (stack1.Size() != stack2.Size()) {
            throw new IllegalArgumentException("Both stacks must have the same size");
        }

        ArrayStack<Integer> result = new ArrayStack<>(stack1.getCapacity());
        int size = stack1.Size();

        // Create temporary arrays to hold the values before popping
        Integer[] temp1Array = new Integer[size];
        Integer[] temp2Array = new Integer[size];

        // Transfer elements to the temporary arrays
        for (int i = 0; i < size; i++) {
            temp1Array[i] = stack1.pop();
            temp2Array[i] = stack2.pop();
        }

        // Sum the elements from the temporary arrays and push to the result stack
        for (int i = 0; i < size; i++) {
            result.push(temp1Array[i] + temp2Array[i]);
        }

        // Push back the original values into the stacks if needed
        for (int i = size - 1; i >= 0; i--) {
            stack1.push(temp1Array[i]);
            stack2.push(temp2Array[i]);
        }

        return result;
    }


    public ArrayStack<String> combineNames(ArrayStack<String> firstNames, ArrayStack<String> lastNames) {
        if (firstNames.Size() != lastNames.Size()) {
            throw new IllegalArgumentException("Both stacks must have the same size");
        }

        ArrayStack<String> result = new ArrayStack<>(firstNames.getCapacity());
        int size = firstNames.Size();

        // Create temporary arrays to hold the values before popping
        String[] firstNameArray = new String[size];
        String[] lastNameArray = new String[size];

        // Transfer elements to the temporary arrays
        for (int i = 0; i < size; i++) {
            firstNameArray[i] = firstNames.pop();
            lastNameArray[i] = lastNames.pop();
        }

        // Combine the names from the temporary arrays and push to the result stack
        for (int i = 0; i < size; i++) {
            result.push(firstNameArray[i] + " " + lastNameArray[i]);
        }

        // Push back the original values into the stacks
        for (int i = size - 1; i >= 0; i--) {
            firstNames.push(firstNameArray[i]);
            lastNames.push(lastNameArray[i]);
        }

        return result;
    }






}
