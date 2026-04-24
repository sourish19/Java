import java.util.Scanner;

class Dimension {
    void area() {
        System.out.println("This is Dimension superclass");
    }
}

class Rectangle extends Dimension {
    int l;
    int w;

    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (this.l * this.w));
    }
}

class Triangle extends Dimension {
    int b;
    int h;

    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * this.b * this.h));
    }
}

public class ass12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for length for Rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the value for width for Rectangle: ");
        int w = sc.nextInt();

        System.out.print("Enter the value for bredth for Triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the value for height for Triangle: ");
        int h = sc.nextInt();

        Rectangle rect = new Rectangle(l, w);
        Triangle tri = new Triangle(b, h);

        rect.area();
        tri.area();
    }
}
