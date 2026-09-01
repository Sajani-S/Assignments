
import java.util.Scanner;
public class ATM {
    public static void main(String[] args){

        double balance = 10000;

       Scanner sc = new Scanner(System.in);
        System.out.print("Withdrawal amount : ");

       double withdrawal = sc.nextDouble();

         if ( withdrawal <= balance){

             System.out.println("Balance is sufficient");

           balance = balance - withdrawal;

             System.out.println("Remaining Balance : " + balance);
         }

         else {

             System.out.println("Insufficient Balance");

         }
    }

}
