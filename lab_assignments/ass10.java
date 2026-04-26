import java.util.Scanner;

class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Area of Rectangle: " + this.length * this.width);
    }
}

class RectBox extends Rectangle {
    int height;

    RectBox(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    void volume() {
        System.out.println("Volume of Rectangle: " + this.length * this.width * this.height);
    }
}

public class ass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();

        Rectangle rect = new Rectangle(length, width);
        RectBox rectBox = new RectBox(length, width, height);
        
        rect.area();
        rectBox.volume();

        sc.close();
    }
}
