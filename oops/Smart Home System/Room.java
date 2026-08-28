
import java .util.ArrayList;
public class Room {

    ArrayList <Device> j = new ArrayList<>();

    public void adddevice(Device p ){

        j.add(p);
    }

public void turnOnAll() {
    System.out.println("turning on all devices");

    for (Device k : j) {

        k.turnOn();

    }
}
      public void turnoffall () {

        System.out.println("turning off all devices");

          for (Device k : j) {

              k.turnof();

          }


    }





























}
