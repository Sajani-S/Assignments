
import java.util.*;

public class rentalsystem {

    public static void main(String[] args) {

        ArrayList<Vehicle> h = new ArrayList<>();

        Car l = new Car();
        Bike m = new Bike();
        Truck j = new Truck();

        h.add(l);
        h.add(m);
        h.add(j);

        int hours = 7;

        for (Vehicle f : h) {

            f.start();
            System.out.println("rent for " + " " + hours + " " + "hours : " + f.calculaterent(hours));
            f.stop();
            System.out.println("--------------------");

        }


    }


}
