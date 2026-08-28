 class Bike implements Vehicle{



     public void start() {
         System.out.println("bike started");
     }


     public void stop() {
         System.out.println("bike stoped");

     }


     public double calculaterent(int hours) {
         return hours * 100;
     }
 }
