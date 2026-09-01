
import java.util.Scanner;
public class Resultsystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int mark [] = new int[5];
        int total = 0;
        boolean passedall = true;

        for(int i = 0 ; i < mark.length ; i++) {
            System.out.print("SUBJECT " + (i + 1) + " " + "MARK" + " : ");
            mark[i] = sc.nextInt();
            total += mark[i];


            if (mark[i] < 35) {
                passedall = false;
            }
        }
        double average = total/5 ;

        System.out.println("TOTAL MARKS : " + total);

        System.out.println("AVERAGE MARK : " + average);

        if(passedall){
            System.out.println("THE STUDENTS HAS PASSED ");
        }
        else {
            System.out.println("THE STUDENT HAS FAILED ");
        }

    }
}






























