import ass16.Operations;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Addeition: " + Operations.addition(num1, num2));
        System.out.println("Subtraction: " + Operations.subtract(num1, num2));
        System.out.println("Multiplication: " + Operations.multiplication(num1, num2));
        System.out.println("Division: " + Operations.division(num1, num2));
    }
}

// * need to compile only this file 