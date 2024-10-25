package ArraysOfStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack myStack = new ArrayStack(2);
        ArrayStack myStack2 = new ArrayStack(2);

        System.out.println(myStack.isEmpty());

        myStack.push("Ali");
        myStack.push("Mo");
        myStack.push("Haji");
        myStack.push("Haji");
        myStack.push("Haji");
        myStack.push("Abdi");
        myStack.push("Amin");
        myStack.push("Asho");
        myStack.push("Asho");

        myStack2.push(19);
        myStack2.push(18);
        myStack2.push(100);
        myStack2.push(25);


      //  System.out.println(myStack.isEmpty());

      //  System.out.println(myStack.pop());
        //System.out.println(myStack.Size());
       // System.out.println(myStack.isFull());
       // System.out.println(myStack.getCapacity());

        //merge(myStack,myStack2);
       // myStack.fullName(myStack,myStack2);
        myStack.display();
        //myStack.find("Asho");
    }
}
