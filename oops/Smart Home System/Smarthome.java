public class Smarthome {


    public static void main(String[] args){

        Room l = new Room();
        Light h = new Light();
        Fan o = new Fan();

        l.adddevice(h);
        l.adddevice(o);


        l.turnOnAll();

        System.out.println("------------");

        l.turnoffall();

















    }



































}
