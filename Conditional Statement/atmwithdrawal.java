public class atmwithdrawal {

    public static void main (String[] args){

        int accountbalance = 30000;
        int withdrawalamount = 2000;

        if( withdrawalamount <= 0 ) {

            System.out.println("invalid amount");


        if( withdrawalamount > accountbalance) {

            System.out.println("insufficient balance ");
        }

        }

          else{

             accountbalance -= withdrawalamount;

             System.out.println("remaining account balance : " + accountbalance);





        }








    }











}
