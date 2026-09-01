import java.util.*;

public class Librarymanagement {

    public static void main(String[] args) {

        book p1 = new book("history", "social", 21);
        book p2 = new book("biology", "science", 22);
        book p3 = new book("python", "computer science", 23);


        ArrayList<book> k = new ArrayList<>();

        k.add(p1);
        k.add(p2);
        k.add(p3);

        System.out.println("Books stored  in library :");

        for (book h : k) {
            h.show();
            System.out.println("--------");
        }

        TreeSet<String> u = new TreeSet<>();

        u.add(p1.category);
        u.add(p2.category);
        u.add(p3.category);

        System.out.println("Categories alphabetically (sorted order) : ");
        for (String o : u) {
            System.out.println(o);

        }
        System.out.println("--------");

        Stack<String> J = new Stack<>();
        J.push(p1.name);
        J.push(p3.name);
        System.out.println("Issued books :");
        for (String h : J) {
            System.out.println(h);

        }

        System.out.println("Recently issued books :" + J.peek());
        System.out.println("-----------");


        HashMap<Integer, book> i = new HashMap<>();
        i.put(p1.id,p1);
        i.put(p2.id,p2);
        i.put(p2.id,p2);


        System.out.println("Details about the book  with the id 22 : ");

        book search = i.get(22);
        search.show();





    }
}
