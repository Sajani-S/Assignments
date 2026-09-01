import java.util.*;
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employeeprogram o1 = new Employeeprogram("devi", 5000, 18);
        Employeeprogram o2 = new Employeeprogram("monika", 8000, 19);
        Employeeprogram o3 = new Employeeprogram("saranya", 2000, 20);
        Employeeprogram o4 = new Employeeprogram("bhuvi", 10000, 18);
        Employeeprogram o5 = new Employeeprogram("anu", 3000, 21);

        ArrayList<Employeeprogram> t = new ArrayList<>();
        HashSet<Integer> j = new HashSet<>();
        TreeSet<Employeeprogram> h = new TreeSet<>(Comparator.comparingDouble(u -> u.salary));
        HashMap<Integer, Employeeprogram> g = new HashMap<>();


        Employeeprogram arr[] = {o1, o2, o3, o4, o5};

        for (Employeeprogram z : arr) {

            if (j.add(z.id)) {

                t.add(z);

                h.add(z);

                g.put(z.id, z);

            } else {

                System.out.println("Duplicate id not allowed :  " + z.id);
            }
        }
              System.out.println();

            System.out.println("EMPLOYEE DETAILS : ");

            for(Employeeprogram k :  t){

                k.show();
                System.out.println("********************");
            }

        System.out.println();

        System.out.println("Employee sorted by salary  :  ");


        for(Employeeprogram f :  h){

            f.show();
            System.out.println("********************");
        }

        System.out.println("Details searched about the id 21 :  ");

          Employeeprogram y = g.get(21);
          y.show();



         Employeeprogram resigned = o5;

              t.remove(o5);
              j.remove(o5);
              h.remove(o5);
              g.remove(o5);

        System.out.println("Removing the resigned employee (name) : " + resigned.name);
        System.out.println("After removing the resigned employee, the list (name) : " );

         for(Employeeprogram b : t) {

             System.out.println(b.name);


         }


    }



}