public class electricitybill {

    public static void main ( String[] args){

     int unit = 350;
     double bill = 0;

     if( unit >=0 && unit <= 100) {

          bill = unit * 2;
         System.out.println("electricity bill :" + bill);

     }
        else if (unit >= 101 && unit <= 200) {

         bill =( 100 * 2  ) + (unit - 100 )* 3 ;
         System.out.println("electricity bill :" + bill);

     }
         else {
             bill = (100 * 2) + ( 100 * 3) + ( unit - 200) * 5;
             System.out.println("electricity bill :" + bill);

         }

         if ( bill > 1000) {
             double discount = bill * 0.10;
             bill = bill - discount;
             System.out.println(" final bill after discount ;" + bill);


         }
          else {

              System.out.println( "no discount");





     }
    }













}
