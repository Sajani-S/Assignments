
import java.util.Scanner;
public class Electricbill {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("UNIT : " );
           int unit = sc.nextInt();
           double bill = 0 ;


         if(unit >= 0 && unit<= 100){
           bill = unit* 2 ;
             System.out.print("BILL AMOUNT  : " + bill);

         }
         else if (unit >= 101 && unit <= 300) {
             bill = (100 * 2) + (unit - 100) * 5;
             System.out.print("BILL AMOUNT  : " + bill);
         }
        else{
            bill = (100 * 2) + (200 * 5) + ( unit - 300) * 7 ;
             System.out.print("BILL AMOUNT  : " + bill);
         }
    }
}
