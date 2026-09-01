
import java.util.Scanner;
public class Arraysum {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        int sum = 0;

        System.out.println("enter five numbers : ");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = sc.nextInt();

            sum += numbers[i];
        }

        System.out.println("the total sum : " + sum);
    }
}