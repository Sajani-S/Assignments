
import java.util.*;
public class DeliverySystem {

    public static void main(String[] args) {

        Food p1 = new Food(7, "ram" , "kfc");
        Food p2 = new Food(8, "devi", "aasif");
        Food p3 = new Food(9, "sneha", "kfc");
        Food p4 = new Food(10, "john", "a1");


        LinkedList<Food> m = new LinkedList<>();
         m.add(p1);
         m.add(p2);
         m.add(p3);
         m.add(p4);

        System.out.println("customer orders :");
        for (Food j : m) {
            j.show();
            System.out.println("---------");
        }

        Queue<Food> f = new LinkedList<>();
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);


        System.out.println ("Precess orders in FIFO : ");

           while (!f.isEmpty()) {
               Food e = f.poll();
               e.show();
               System.out.println("--------------");
           }



        HashSet<String> s = new HashSet<>();
        s.add(p1.restaurant);
        s.add(p2.restaurant);
        s.add(p3.restaurant);
        s.add(p4.restaurant);

        System.out.print("unique restaurant  : ");
        for (String c : s) {
            System.out.print(c + ", ");
        }
        System.out.println();

        m.remove(p1);
        m.remove(p3);
         f.remove(p1);
         f.remove(p3);
         s.remove(p1.restaurant);
         s.remove(p3.restaurant);


        ArrayList<Food> cancelledorder = new ArrayList<>();
        cancelledorder.add(p1);
        cancelledorder.add(p3);

        System.out.println("Cancelled orders :  ");

        for (Food n : cancelledorder) {
            n.show();
            System.out.println("--------------");

        }
        System.out.println("Total number of orders :" + m.size());







        }
       }





























