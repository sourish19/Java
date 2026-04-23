class Rectangle {
    int l;
    int w;

    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    int area() {
        return this.l * this.w;
    }

    int perimeter() {
        return 2 * (this.l + this.w);
    }

    void display(int val, String type) {
        System.out.println(type + " of Rectangle is: " + val);
    }
}

public class ass1 {
    public static void main(String[] args) {
        int l = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);

        Rectangle rect = new Rectangle(l, w);

        int area = rect.area();
        int perimeter = rect.perimeter();

        rect.display(area, "Area");
        rect.display(perimeter, "Perimeter");
    }
}
