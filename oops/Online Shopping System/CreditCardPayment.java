 class CreditCardPayment extends Payment{

    public void pay(double amount){

System.out.println("paid"  + "   " + amount  + "    " +"using credit card");
    }


}

 class UpIPayment extends Payment{

     public void pay(double amount) {

         System.out.println("paid"  + "  " + amount  + "   " +"using UPI");

     }

     }