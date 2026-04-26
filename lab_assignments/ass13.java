import java.util.Scanner;

class Box {
    int l;
    int b;
    int h;

    Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    int volume() {
        int vol = this.l * this.b * this.h;
        return vol;
    }

}

class BoxWeight extends Box {
    int w;

    BoxWeight(int l, int b, int h, int w) {
        super(l, b, h);
        this.w = w;
    }
}

class Shipment extends BoxWeight {
    int costPerUnitVol;
    int costPerUnitWeight;

    Shipment(int l, int b, int h, int w, int costPerUnitVol, int costPerUnitWeight) {
        super(l, b, h, w);
        this.costPerUnitVol = costPerUnitVol;
        this.costPerUnitWeight = costPerUnitWeight;
    }

    int calculateShippingCost() {
        return ((this.costPerUnitVol * this.volume()) + (this.costPerUnitWeight * this.w));
    }
}

public class ass13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        System.out.print("Enter height: ");
        int h = sc.nextInt();

        System.out.print("Enter weight: ");
        int w = sc.nextInt();

        System.out.print("Enter cost per unit volume: ");
        int costPerUnitVol = sc.nextInt();

        System.out.print("Enter cost per unit weight: ");
        int costPerUnitWeight = sc.nextInt();

        Shipment s = new Shipment(l, b, h, w, costPerUnitVol, costPerUnitWeight);
        int vol = s.volume();
        System.out.println("Volume of Rectangular Parcel: " + vol);
        int cost = s.calculateShippingCost();
        System.out.println("Shipping cost of the parcel: " + cost);

        sc.close();
    }
}
