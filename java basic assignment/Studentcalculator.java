

import java.util.Scanner;

public class Studentcalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("The student mark : ");

        int mark = sc.nextInt();

        if(mark >= 90 && mark <= 100){

            System.out.println("student has attained A grade  ");

        }
       else if (mark >= 70 && mark <= 89) {

            System.out.println("student has attained B grade  ");


        }

        else if (mark >= 50 && mark <= 69) {

            System.out.println("student has attained C grade  ");


        }

        else {
            System.out.println("student has failed  ");

        }
    }
}
