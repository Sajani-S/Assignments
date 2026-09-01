
import java .util.Scanner;
public class Mobilerecharge {

    public static void main (String[] args){

    System.out.println("Mobile recharge plan : ");
    System.out.println("1. ₹ 199");
    System.out.println("2. ₹ 399 ");
    System.out.println("3. ₹ 599 ");

        System.out.print("enter your choice :  ");
        Scanner sc = new Scanner(System.in);

        int choice  = sc.nextInt();

       switch (choice){

         case 1 :

             System.out.println("selected plan : 199 ");

             System.out.println("validity is for  15 days ");

          break;

         case 2 :

             System.out.println("selected plan : 399 ");

             System.out.println("validity is for  55 days ");

             break;

         case 3 :

             System.out.println("selected plan : 599 ");

             System.out.println("validity is for  45 days ");

             break;

         default:
             System.out.print("invalid selection");

     }
    }
}
