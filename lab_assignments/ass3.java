class Volume {
    void volume(int l, int w, int h) {
        System.out.println("Volume of Rectanglular Box: " + l * w * h);
    }

    void volume(int a) {
        System.out.println("Volume of Cube: " + a * a * a);
    }

    void volume(int r, int h) {
        System.out.println("Volume of Cylinder: " + 3.14 * (r * r) * h);
    }
}

public class ass3 {
    public static void main(String[] args) {
        Volume v = new Volume();

        v.volume(5,10,15);
        v.volume(3);
        v.volume(3,8);
    }
}
