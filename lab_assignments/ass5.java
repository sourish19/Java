class Calculator {
    static int addition(int num1, int num2) {
        return num1 + num2;
    }

    static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    static int division(int num1, int num2) {
        return num1 / num2;
    }
}

public class ass5 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int add = Calculator.addition(num1, num2);
        int sub = Calculator.subtract(num1, num2);
        int multi = Calculator.multiplication(num1, num2);
        int div = Calculator.division(num1, num2);

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + multi);
        System.out.println("Division: " + div);
    }
}
