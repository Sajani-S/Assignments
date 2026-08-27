public class logic {
    public static void main ( String[] args) {

        int chemistry = 40 ;
        int physics = 70 ;
        int biology = 90 ;
        double average = ( chemistry + physics + biology ) /3.0;

        if(chemistry >= 35 &&  physics >= 35 && biology >= 35 && average >= 55 ) {

            System.out.println( "result : pass ");
        }
        else{

            System.out.println("result : fail " );

        }



    }







}
