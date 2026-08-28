public class BankAccount {

    private String accountnumber;
    private double balance;

    public BankAccount(String accountnumber, double balance) {

        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    String getAccountnumber() {
        return accountnumber;
    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;
            System.out.println("deposited : " + amount);

        } else {

            System.out.println("invalid amount");
        }
    }


    public void  deposit(double amount, String note) {

        if (amount > 0) {

            balance += amount;

            System.out.println("deposited : " + amount + " ," + "note : " + note);

        }
        else {

            System.out.println("invalid amount");

        }
    }

    public void withdraw(double amount){

if (amount > 0 && amount <= balance){

    balance-=amount;

    System.out.println("withdraw: " +" " + amount );

}

else{
    System.out.println("insufficient balance" );

}
    }




}