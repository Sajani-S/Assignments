 class Car implements  Vehicle{



     public void start() {
    System.out.println("car started");
     }



     public void stop() {
         System.out.println("car stoped");

     }


     public double calculaterent(int hours) {
         return hours * 50;
     }
 }
