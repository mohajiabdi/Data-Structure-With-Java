package ArrayQueues;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class CircularArrayQueue <T> {
    //Data Fileds for all methods
    private static final int DEFAULT_CAPACITY = 2;  // Default capacity of queue
    private int front, rear, counter;
    private T[] queue;

    // Variables for Search Methods
    String indexes;
    int times;


    //constructors
//    public CircularArrayQueue(int capacity){
//        queue = (T[]) new Object[capacity];
//        front = rear = -1;
//        counter = 0;
//    }
    public CircularArrayQueue(int capacity){
        queue = (T[]) new Object[capacity];
        front = rear = counter = 0;
    }

    public CircularArrayQueue(){
        this(DEFAULT_CAPACITY);
    }

    //Methods

    // isEmpty
    public boolean isEmpty(){
        return counter == 0;
    }

    // isFull
    public boolean isFull(){
        return counter == queue.length;
    }

    // size
    public int size(){
        return counter;
    }

    // first element
    public T first() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return queue[front];
    }

    // last element
    public T last() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
//        return queue[(front + counter -1) % queue.length];
        return queue[(rear - 1 + queue.length) % queue.length];
    }

    // expand Capacity
    private void expandCapacity(){
        T[] larger = (T[]) new Object[queue.length *2];
        for (int scan = 0; scan < counter; scan++){
            larger[scan] = queue[front];
            front = (front + 1) % queue.length;
        }
        front = 0;
        rear = counter;
        queue = larger;
    }

   //enqueue
    public void enqueue(T element){
        if (size() == queue.length){
            expandCapacity();
        }
        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        counter++;
    }


    // dequeue
    public T dequeue() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T result = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        counter--;

        return result;
    }

    public void printQueue() {
        if(isEmpty()){
            System.out.println("\n\nQueue is empty");
            return;  // Terminate the code here
        }
        int index = front;
        for(int i = 0; i < counter; i++){
            System.out.print(queue[index] + ", ");
            index = (index + 1) % queue.length;
        }
    }

    @Override
    public String toString() {
        return "\nCircular Array Queue {" + "\n"+
                "Front: " + front + "\n"+
                "Rear: " + rear + "\n"+
                "Counter: " + counter + "\n"+
                "Queue: " + Arrays.toString(queue) +"\n"+
                '}';
    }

    // Search Element
    public void search(T element){
        indexes = "";
        times = 0;
        if(isEmpty()){
            System.out.println("Array is Empty!");
            return;  // Terminate the code here
        }
        int index = front;
        for(int  i=0; i<counter; i++){
            if(element.equals(queue[index])){
                times++;
                indexes += index + ", ";
            }
            index = (index + 1) % queue.length;
        }

        if(times == 0){
            System.out.println("Element not found!");
        }else{
            System.out.println(element + " Found " + times + " times at [" + indexes + "]");
        }
    }

    // Extra Methods to try
    // Reverse the order of the elements
//

    // Reverse using Stacks
    public void reverseUsingStack() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Stack<T> stack = new Stack<T>();


        //Deque All Elements
        while(!isEmpty()){
            stack.push(dequeue());
        }

        while(!stack.isEmpty()){
            enqueue(stack.pop());
        }
        System.out.println("Queue reversed Using Stack!");
    }


    //Reverse in Array Queue
    public void reverseArrayQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return;
        }
        int start = front;
        int end = (front + counter -1) % queue.length;

        for(int i = 0; i< counter /2; i++) {
            // Swap queue[start] with queue[end]
            T temp = queue[start];
            queue[start] = queue[end];
            queue[end] = temp;

            start = (start + 1) % queue.length;
            end = (end - 1 + queue.length) % queue.length;
        }
        System.out.println("Queue is reversed in Place");
    }

    // find max
    public T findMax()throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T max = queue[front];
        int index = front;
        for(int i = 0; i < counter; i++) {
            if(((Comparable<T>) queue[index]).compareTo(max) > 0){
                max = queue[index];  //Update max if larger Element is found....
            }
            index = (index + 1) % queue.length;
        }
        return max;
    }public T findMin()throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T min = queue[front];
        int index = front;
        for(int i = 0; i < counter; i++) {
            if(((Comparable<T>) queue[index]).compareTo(min) < 0){
                min = queue[index];  //Update max if larger Element is found....
            }
            index = (index + 1) % queue.length;
        }
        return min;
    }


    // CLear Array Queue
    public void clearQueue(){
        front = counter = rear = 0;
        Arrays.fill(queue, null);
        System.out.println("\nQueue Cleared!!");
    }



    // Main

    public static void main(String[] args) {
        CircularArrayQueue<String> names = new CircularArrayQueue<>();

        names.enqueue("Abdi");
        names.enqueue("Bashiir");
//        names.enqueue("Halimo");
//        System.out.println(names);
        names.enqueue("Dahir");
//        System.out.println(names);
//        System.out.println("Removed: "+names.dequeue());
//        System.out.println(names);
        names.enqueue("Halimo");
        names.enqueue("Shayma Abdulahi");
//        System.out.println(names);
//        System.out.println(names.dequeue());
//        System.out.println(names);

//        names.reverseUsingStack();
//        names.reverseArrayQueue();
//        System.out.println(names);


//        System.out.println(names.first());
//        System.out.println(names.last());

//        names.search("Halimoo");

//        System.out.println(names.findMax());
//        System.out.println(names.findMin());

        names.printQueue();
        names.clearQueue();
        names.printQueue();
        System.out.println();
    }
}
