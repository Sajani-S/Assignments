
import java . util.*;
public class AttendanceSystem {

    public static void main(String[] args){
        ArrayList <String> p = new ArrayList<>();

        p.add("bhuvi");
        p.add("ram");
        p.add("sam");
        p.add("diya");
        p.add("ramya");
        p.add("moni");
        p.add("raj");
        p.add("sami");
        p.add("neha");
        p.add("krithick");
        p.add("neha");

        LinkedHashSet<String> u  = new LinkedHashSet<>();
          u.addAll(p);

           HashSet<String> j = new HashSet<>();
           j.addAll(u);

        System.out.println("attendance order list : " + u);

        HashMap<Integer,String> h = new HashMap<>();

         int rollnumber = 1;
          for (String y : u){
              h.put(rollnumber,y);
              rollnumber++;
          }

        System.out.println("student with roll number 7 : " + h.get(7));

          String absent =  "moni";

         u.remove(absent);
           j.remove(absent);
           h.remove(absent);
        System.out.println("absent student name : " + absent);
        System.out.println("attendance order after removing absent members : " + u);






    }








}
