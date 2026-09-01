
import java .util.Scanner;
public class verification {

    public static void main(String[] args){

        String storedusername = "admin";
        String storedpassword = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER USER NAME : ");
        String username = sc.next();


        System.out.print("ENTER  PASSWORD  : ");
        String password = sc.next();


        if(storedusername.equals(username) && storedpassword.equals(password)){
            System.out.println("login successfully ");
        }
        else {
            System.out.println("invalid password or  usernamme and login failed  ");
        }
    }
}
