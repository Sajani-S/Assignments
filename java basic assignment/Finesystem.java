
import java .util.Scanner;
public class Finesystem {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("delayed days : ");

        int days = sc.nextInt();

        double totalfine = 0;

        if(days<= 5){

            totalfine = days * 2 ;

        }

        else {

            totalfine = (5 * 2 ) + (days- 5 )* 5 ;

        }

        System.out.print("Total fine :  " + totalfine);
















    }



























}
