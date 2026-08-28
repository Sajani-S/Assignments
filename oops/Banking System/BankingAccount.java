public class BankingAccount {

    public static void main(String[] args){

        BankAccount a1 = new BankAccount("1345", 8000);
        BankAccount a2 = new BankAccount( "9800" , 5000);

        System.out.println("account a1 transactions :");

        a1.deposit(400);
        a1.deposit(700,"salary");
        a1.withdraw(400);

        System.out.println("-----------------------");
        System.out.println("account a2 transactions : ");

        a2.deposit(800);
        a2.deposit(300,"salary");
        a2.withdraw(200);

        System.out.println("-----------------------");

        System.out.println("final balance : ");
        System.out.println("account a1 ,  number " + a1.getAccountnumber() + " = " + a1.getBalance());
        System.out.println( "account a2 , number " + a2.getAccountnumber() + " = " + a2.getBalance());










    }



















}
