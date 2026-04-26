class Cone {
    Cone(int r, int h) {
        System.out.println("Volume of a cone with arguments: " + ((1.0 / 3) * Math.PI * (r * r) * h));
    }

    Cone() {
        int r = 3, h = 5;
        System.out.println("Volume of a cone with no arguments: " + ((1.0 / 3) * Math.PI * (r * r) * h));
    }
}

public class ass4 {
    public static void main(String[] args) {
        new Cone(3, 5);
        new Cone();
    }
}
