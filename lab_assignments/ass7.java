import java.util.Scanner;

class Stack {
    int[] arr = new int[5];
    int top = 0;

    void push(int val) {
        this.arr[top] = val;
        this.top++;
    }

    void pop() {
        this.top--;
    }

    void display() {
        System.out.print("Stack: ");
        for (int i = 0; i < top; i++) {
            System.out.print(this.arr[i] + " ");
        }
    }
}

public class ass7 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);

        stack.push(sc.nextInt());
        stack.push(sc.nextInt());
        stack.push(sc.nextInt());

        stack.pop();

        stack.display();
    }
}
