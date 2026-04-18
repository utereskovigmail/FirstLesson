import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Person p = new Person("John", 25);
        p.Me();
        p.SayHello();
        System.out.println("\n\n");

        Builder b = new Builder("John", 25, 10000, 5);
        b.Me();
        b.SayHello();

        System.out.println("\n\n");

        Pilot pilot = new Pilot("Dima", 30, 25000);
        pilot.Me();
        pilot.SayHello();

    }
}
