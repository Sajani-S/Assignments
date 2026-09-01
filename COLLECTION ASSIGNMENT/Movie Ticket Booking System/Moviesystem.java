

import java.util.*;

public class Moviesystem {

    public static void main(String[] args){


        Movie p1 = new Movie("ram",4);
        Movie p2 = new Movie("sam",5);
        Movie p3 = new Movie("ravi",6);
        Movie p4= new Movie("hari",5);
        Movie p5= new Movie("savi",4);



             ArrayList<Movie> s = new ArrayList<>();
             HashSet<Integer> j = new HashSet<>();
             Queue<Movie> o = new   LinkedList<>();
             Stack<Movie>  k = new Stack<>();

             Movie arr [] = { p1, p2, p3 , p4 , p5};

            for (Movie u: arr) {

                if (j.add(u.seat)) {
                    s.add(u);
                    k.push(u);

                } else {

                    System.out.println("seat number" + " " + u.seat + " " + " already booked ");
                    o.add(u);

                }

            }


               System.out.println("Booked seats details :");

                for(Movie x : s){

                    x.diplay();

                    System.out.println();

                }

        System.out.println("Waiting list :");

        for (Movie g : o ){

            g.diplay();
            System.out.println();
        }

        System.out.println("Latest Booking historyy :");
        
        while (!k.isEmpty()) {
            Movie e = k.pop();
            e.diplay();
        System.out.println();
    }


        Movie cancelled = p2;

            s.remove(p2);
            j.remove(p2);
            k.remove(p2);
            o.remove(p2);


        System.out.println("Final booking after cancelling  :");

        for (Movie u : s ){
            u.diplay();
            System.out.println();
        }


    }




















    }





















