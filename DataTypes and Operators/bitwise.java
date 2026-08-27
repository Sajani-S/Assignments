public class bitwise {

public static void main (String[] args){

    int a = 45 , b = 33 , result ;
    result = ( ( a > b ) ? a : b ) ;

    System.out.println("largest number : " + result);

     int c  = 6 , d = 8 ;
    System.out.println("add : " + ( c & d));
    System.out.println("or : " + ( c | d));
    System.out.println("xor : " + ( c ^ d ));
    System.out.println("not : " + ( ~ d ));



}




}
