package ArrayQueues;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class CircularArrayQueueInteger {
    //Data Fileds for all methods
    private static final int DEFAULT_CAPACITY = 2;  // Default capacity of queue
    private int front, rear, counter;
    private int[] queue;

    // Variables for Search Methods
    String indexes;
    int times;

    // Constructors
    public CircularArrayQueueInteger(int capacity){
        queue = new int[capacity];
        front = rear = counter = 0;
    }

    public CircularArrayQueueInteger(){
        this(DEFAULT_CAPACITY);
    }


    //----------------------------------------------------------------



    // Methods
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
    public int first() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return queue[front];
    }

    // last element
    public int last() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
//        return queue[(front + counter -1) % queue.length];
        return queue[(rear - 1 + queue.length) % queue.length];
    }

    // expand Capacity
    private void expandCapacity(){
        int[] larger = new int[queue.length *2];
        for (int scan = 0; scan < counter; scan++){
            larger[scan] = queue[front];
            front = (front + 1) % queue.length;
        }
        front = 0;
        rear = counter;
        queue = larger;
    }



    public void enqueue(int element){
        if (size() == queue.length){
            expandCapacity();
        }
        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        counter++;
    }


    // dequeue
    public int dequeue() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = queue[front];
        queue[front] = 0;
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
    public void search(int element){
        indexes = "";
        times = 0;
        if(isEmpty()){
            System.out.println("Array is Empty!");
            return;  // Terminate the code here
        }
        int index = front;
        for(int  i=0; i<counter; i++){
            if(element == (queue[index])){
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
        Stack<Integer> stack = new Stack<>();


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
            int temp = queue[start];
            queue[start] = queue[end];
            queue[end] = temp;

            start = (start + 1) % queue.length;
            end = (end - 1 + queue.length) % queue.length;
        }
        System.out.println("Queue is reversed in Place");
    }

    // find max
    public int findMax()throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int max = queue[front];
        int index = front;
        for(int i = 0; i < counter; i++) {
            if(((Comparable<Integer>) queue[index]).compareTo(max) > 0){
                max = queue[index];  //Update max if larger Element is found....
            }
            index = (index + 1) % queue.length;
        }
        return max;
    }public int findMin()throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int min = queue[front];
        int index = front;
        for(int i = 0; i < counter; i++) {
            if(((Comparable<Integer>) queue[index]).compareTo(min) < 0){
                min = queue[index];  //Update max if larger Element is found....
            }
            index = (index + 1) % queue.length;
        }
        return min;
    }


    // CLear Array Queue
    public void clearQueue(){
        front = counter = rear = 0;
        Arrays.fill(queue, 0);
        queue = new int[DEFAULT_CAPACITY];
        System.out.println("\nQueue Cleared!!");
    }

    // Is Palindrome
    public boolean isPalindrome() {
        if(isEmpty()) return false;

        int frontIndex = front;
        int rearIndex = (front + counter -1) % queue.length; // Logical Rear "Kii uga danbeeyay aan soo galiyay!"

        for(int i = 0; i < counter/2; i++){
            if(queue[frontIndex] != (queue[rearIndex])){
                return false;
            }
            frontIndex = (frontIndex + 1) % queue.length;
            rearIndex = (rearIndex -1 + queue.length) % queue.length;
        }

        return true;

    }



    // Main Method
    public static void main(String[] args) {
        CircularArrayQueueInteger numbers = new CircularArrayQueueInteger();


        numbers.enqueue(1);
        numbers.enqueue(2);
        numbers.enqueue(3);
        numbers.enqueue(2);
        numbers.enqueue(1);

        System.out.println(numbers.isPalindrome());
        System.out.println();

        numbers.printQueue();
        System.out.println(numbers);
        System.out.println("Maximum is: " + numbers.findMax());
        System.out.println("Minimum is: " + numbers.findMin());

        numbers.clearQueue();
        numbers.printQueue();
        System.out.println(numbers);
    }



}
