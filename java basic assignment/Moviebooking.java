
import java.util.Scanner;
public class Moviebooking {
    public static void main(String[] args){

         double price = 150 ;

        System.out.println("TICKET PRICE : " + price);

          Scanner sc = new Scanner(System.in);

        System.out.print("NUMBER OF TICKETS  : " );

          int quantity = sc.nextInt();

          double totalamount = price * quantity;

          if(quantity > 5){

              System.out.println("5 % of discount  " );

                double discount = totalamount * 0.05;
                totalamount = totalamount - discount;

              System.out.println("TOTAL AMOUNT :  " + totalamount);

          }
             else {

              System.out.println("no discount " );

              System.out.println("TOTAL AMOUNT :  " + totalamount);

          }
    }

}
