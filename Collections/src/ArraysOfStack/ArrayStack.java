package ArraysOfStack;

public class ArrayStack <T> {
    private final static int DEFAUL_CAPACITY =2;
    private int top;
    T[] stack;

    public ArrayStack(int initial_Capacity){
        this.top = 0;
        stack = (T[])(new Object[initial_Capacity]);
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
    void display(){
        for(int i=this.top-1; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

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
}
