package ArraysOfStack;

public class Main {
    public static void main(String[] args) {
//        ArrayStack myStack = new ArrayStack(2);
//        ArrayStack myStack2 = new ArrayStack(2);
//
//        System.out.println(myStack.isEmpty());
//
//        myStack.push("Ali");
//        myStack.push("Mo");
//        myStack.push("Haji");
//        myStack.push("Haji");
//        myStack.push("Haji");
//        myStack.push("Abdi");
//        myStack.push("Amin");
//        myStack.push("Asho");
//        myStack.push("Asho");
//
//        myStack2.push(19);
//        myStack2.push(18);
//        myStack2.push(100);
//        myStack2.push(25);


      //  System.out.println(myStack.isEmpty());

      //  System.out.println(myStack.pop());
        //System.out.println(myStack.Size());
       // System.out.println(myStack.isFull());
       // System.out.println(myStack.getCapacity());

        //merge(myStack,myStack2);
       // myStack.fullName(myStack,myStack2);
//        myStack.display();
        //myStack.find("Asho");


        ArrayStack midTerm = new ArrayStack(3);
        ArrayStack finale = new ArrayStack(3);

        midTerm.push(30);
        midTerm.push(800);
        midTerm.push(25);

        finale.push(400);
        finale.push(30);
        finale.push(200);

        ArrayStack<Integer> total = midTerm.totalInt(midTerm, finale);

        

//        for(int i=0; i<total.Size(); i++)
//        System.out.println(total);

        total.display();

        //System.out.println(midTerm.Size());


    }
}
