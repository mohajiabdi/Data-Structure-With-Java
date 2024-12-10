package LinkedQueues;

import LinkedList.Node;

import java.util.EmptyStackException;

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


    public void display() {
      StringBuffer name = new StringBuffer();
      Node<T> current = head;
      while(current != null) {
          name.append(current.getElement()).append("\n");
          current = current.getNext();
      }
    }

// Main mehtod

    public static void main(String[] args){
        LinkedQueue<String> names = new LinkedQueue<>();
        names.enqueue("ALi");
        names.enqueue("Asho");
        names.enqueue("Adan");
        names.enqueue("Ahmed");
        names.enqueue("Anzal");


        names.printQueue();
    }
}
