public class calculator {

           public static void main (String[] args) {

        System.out.println("menu :");
        System.out.println(" 1 . addition");
        System.out.println(" 2 . subtraction");
        System.out.println(" 3 . multiplication");
        System.out.println(" 4 . division");
        System.out.println(" 5 . modulas");
         int choice = 3;
        System.out.println(" enter your choice ( 1 - 5) : " + choice );

               double num1 = 18;
               double num2 = 7;
               double result =  0;

               System.out.println( "enter first number : " + num1);
               System.out.println(" enter second number : " + num2);

          switch (choice){

              case 1 :

                   result = num1 + num2;
                  System.out.println(" the result is :" + result);

                  break;

              case 2 :

                  result = num1 - num2;
                  System.out.println("the result is :" + result );

                  break;

              case 3 :
                  result = num1 * num2;
                  System.out.println(" the result is :" + result);


                  break;
              case 4 :

                  if ( num2 == 0){

                      System.out.println("error so can not divide");

                  }
              else{
                  result = num1 / num2;
                      System.out.println(" the result is :" + result);

                  }

              break;
              case 5 :
                  if ( num2 == 0){
                      System.out.println("error and can't divide");

                  }
                   else{
                      System.out.println(" the result is :" + result);

                      result = num1 % num2;
                  }

              default:
                  System.out.println("invalid choice");





          }













           }






}
