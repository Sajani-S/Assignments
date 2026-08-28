public class Truck implements Vehicle{


    public void start() {
        System.out.println("truck started");
    }


    public void stop() {
        System.out.println("truck stoped");

    }


    public double calculaterent(int hours) {
        return hours * 60 ;
    }
}
