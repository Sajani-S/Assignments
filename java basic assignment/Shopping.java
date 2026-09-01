
import java.util.Scanner;
public class Shopping {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String name = " school bag ";

    System.out.println("PRODUCT NAME : " + name);

    System.out.print("price : " );

    double price = sc.nextDouble();
    System.out.print("quantity :  " );

    int quantity = sc.nextInt();

    double totalamount = price * quantity;

if(totalamount > 5000){

    System.out.println("Discount 10 % " );

    double discount  = totalamount * 0.1 ;
    totalamount = totalamount - discount;
    System.out.println("Total amount :  " + totalamount );

}
 else {
    System.out.println("No Discount  " );
    System.out.println("Total amount :  " + totalamount );
 }







}


























}
