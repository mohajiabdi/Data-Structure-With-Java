package ArraysOfStack;

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
            System.out.print(stack[i] + " \t");
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

T[] merge(T[] stack, T[] stack2){
        //int[] mergedLength = new int[stack.length + stack2.length];
       // System.arraycopy(stack,0,mergedLength,stack.length,stack2.length);
merged =(T[]) new Object[stack.length + stack2.length];
//    System.arraycopy(stack,0,this.stack,0,this.stack.length);
//    System.arraycopy(stack2,0,this.stack,stack.length,this.stack.length);
    System.arraycopy(stack,0,merged,0,stack.length);
    System.arraycopy(stack2,0,merged,stack.length,stack.length);
    return merged;
    }

    void  fullName(T[] stack, T[]stack2){
       T[] merged =(T[]) new Object[stack.length + stack2.length];
        for(int i=0; i <top; i++){
            System.out.println(stack[i] +" "+stack2[i]);
        }
    }
}
