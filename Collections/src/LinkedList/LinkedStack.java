package LinkedList;

import java.util.EmptyStackException;

public class LinkedStack <T> {
    private int count;
    private Node<T> top;
    public LinkedStack(){
        count = 0;
        top = null;
    }

    public void push(T element){
        Node<T> temp = new Node<T>(element);
        temp.setNext(top);
        top = temp;
        count++;
    }

    public T pop() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void printStack() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        Node<T> current = top;
        while(current!=null){
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
    }

    public boolean searchElement(T serachData){
        Node<T> current = top;
        boolean found = false;
        while(current!=null){
            if(current.getElement().equals(serachData)){
                found = true;
                break;
            }
            current = current.getNext();
        }
        return found;
    }

    public int counter(T element){
        Node<T> current = top;
        int counter = 0;
        while(current!=null){
            if(current.getElement().equals(element)){
                counter++;
            }
            current = current.getNext();
        }
        return counter;
    }
    public T peek() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        return top.getElement();
    }

}
