public class result {

    public static void main (String[] args){

        int h = 78;
        if(h> 100 || h < 0){
            System.out.println("invalid marks");
        }
        else if (h>=60 && h<=79 ) {
           System.out.println("result : pass");
           System.out.println( "grade : first class");
        }
       else if ( h>= 80 && h<= 100) {

           System.out.println("result : pass ");
           System.out.println( "grade : distinction");
        }
       else  if ( h >= 35 && h <= 59) {
           System.out.println("pass");
    }


           else

    {
        System.out.println("result : fail");
        }







    }
















}
