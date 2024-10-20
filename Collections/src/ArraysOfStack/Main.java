package ArraysOfStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack myStack = new ArrayStack(2);

        System.out.println(myStack.isEmpty());

        myStack.push("Ali");
        myStack.push("Mo");
        myStack.push("Haji");
        myStack.push("Abdi");
        myStack.push("Amin");
        myStack.push("Asho");


      //  System.out.println(myStack.isEmpty());

        System.out.println(myStack.pop());
        System.out.println(myStack.Size());

        myStack.display();
    }
}
