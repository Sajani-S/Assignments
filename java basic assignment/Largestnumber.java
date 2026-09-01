import java.util.*;

public class Largestnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a : ");
        int a = sc.nextInt();

        System.out.print("b : ");
        int b = sc.nextInt();

        System.out.print("c : ");
        int c = sc.nextInt();

        if(a> b && a> c){
            System.out.print("a is the largest number among three");
        }
        else if(b>a && b> c) {
            System.out.print("b is the largest number among three");
        }

      else{
            System.out.print("c is the largest number among three");
        }



    }
}