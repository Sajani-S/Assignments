import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("number : ");
        int num = sc.nextInt();
        int original = num ;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }

        if(reverse == original){

            System.out.println(" the number is pallindrom");
        }
        else {
            System.out.println("the number is not pallindrom");
        }
    }
}
