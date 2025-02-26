package Recursions;

public class Recursion {

    public Recursion (){}


    // Factorial implementation using Recursive Methods
    int factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

    // Sum of Numbers from n to 0
    int sumNumbers(int n){
        if(n == 0)
            return 0;
        else
            return n + sumNumbers(n-1);
    }

    // Power using recursive method
    int power(int base, int exponent){
        if(exponent == 0)
            return 1;
        else
            return base * power(base, exponent-1);
    }

    // Fibonacci Recursive method
    int recursiveFibonacci(int n){
        if(n <= 1)
            return n;
        else
            return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }


    // Main Method Implementation
    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        System.out.println("Factorial of 5 is: " + recursion.factorial(5));
        System.out.println("Sum of 5 is: " + recursion.sumNumbers(5));
        System.out.println("2 to the Power 5 is: " + recursion.power(2,5 ));
    }
}
