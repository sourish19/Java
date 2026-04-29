import java.util.Scanner;

abstract class Person {
    abstract void read(String name, int id);

    abstract void print();
}

class Teacher extends Person {
    String name;
    int id;

    void read(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void print() {
        System.out.println("Teacher: ");
        System.out.println("Name: " + this.name + " Id: " + this.id);
    }
}

class Student extends Person {
    String name;
    int id;

    void read(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void print() {
        System.out.println("Student: ");
        System.out.println("Name: " + this.name + " Id: " + this.id);
    }
}

public class ass14 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        Teacher t = new Teacher();
        Student s = new Student();

        t.read("Striver", 1);
        t.print();
        s.read("Levi", 19);
        s.print();

        // sc.close();
    }
}
