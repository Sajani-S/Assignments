public class calculatorexample {

   void add (int a , int b ) {

       int sum = a +b;

       System.out.println ( "addition : " + sum);

   }

    int multiply ( int a , int b) {

       return a * b ;

   }

   double divide ( double a , double b){

       return a / b ;
   }

     void greet ( String name) {

         System.out.println ( name);

     }

      public static void main ( String [] args) {

         calculatorexample obj = new calculatorexample();

        obj. add(2,3);
        System.out.println ( "multiplication : " + obj.multiply(5,2));
        System.out.println ( "division: " + obj.divide(2.4,1.2));
        obj.greet ( "rajasthan royals");




      }










}
