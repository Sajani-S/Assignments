
import java.util.Scanner;
public class SALARY {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print(" Basic salary : ");

           double salary = sc.nextDouble();

            double HRA = salary * 0.2;
            double DA = salary * 0.1;

              double totalsalary = salary + HRA + DA;

        System.out.println(" Final total  salary : " + totalsalary);
    }
}
