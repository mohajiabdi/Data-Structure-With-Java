package LinkedQueues;

import LinkedList.Node;

import java.util.EmptyStackException;
import java.util.Queue;
import java.util.Stack;

public class LinkedQueue <T>{
    private Node<T> head;
    private Node<T> tail;
    private int counter;

    LinkedQueue(){
        head = null;
        tail = null;
        counter = 0;
    }

    public boolean isEmpty(){
        return counter==0;
    }

    public void enqueue(T element){
        Node<T> node = new Node<>(element);
        if(isEmpty()){
            head = node;
        }else{
            tail.setNext(node);
        }
        tail = node;
        counter++;
    }

    public T dequeue() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T result = head.getElement();
        head = head.getNext();
        if(isEmpty()){
            tail = null;
        }
        counter--;
        return result;
    }

    public T first () throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return head.getElement();
    }

    public int size(){
        return counter;
    }

    public void printQueue() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        Node<T> current = head;
        while(current!=null){
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }


    public StringBuffer display() {
      StringBuffer name = new StringBuffer();
      Node<T> current = head;
      while(current != null) {
          name.append(current.getElement()).append("\n");
          current = current.getNext();
      }
      return name;
    }

    //------------------------------------------------

    public LinkedQueue<T> reverseQueue(LinkedQueue<T> orginalQueue) {
        Stack<T> stack = new Stack<>();

        // Push all elements of the original queue into stack
        while(!orginalQueue.isEmpty()) {
            stack.push(orginalQueue.dequeue());
        }

        LinkedQueue<T> reversedQueue = new LinkedQueue<>();

        // Push all elements of stack back into reversedQueue
        while(!stack.isEmpty()) {
            reversedQueue.enqueue(stack.pop());
            orginalQueue.enqueue(reversedQueue.dequeue());
        }


        return orginalQueue;
    }
// Deep copy
    public LinkedQueue<T> copy(LinkedQueue<T> sourceQueue) {
        LinkedQueue<T> result = new LinkedQueue<>();
        Node<T> current = sourceQueue.head;
        while(current!= null) {
            result.enqueue(current.getElement());
            current = current.getNext();
        }
        return result;
    }



// Main mehtod

    public static void main(String[] args){
        LinkedQueue<String> names = new LinkedQueue<>();
        LinkedQueue<String> newNames = new LinkedQueue<>();
        names.enqueue("ALi");
        names.enqueue("Asho");
        names.enqueue("Adan");
        names.enqueue("Ahmed");
        names.enqueue("Anzal");

        newNames = names.copy(names);
        names.reverseQueue(names);
//        names.printQueue();
        newNames.printQueue();
//        System.out.println( names.display());
    }
}
