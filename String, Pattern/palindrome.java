public class palindrome {

    public static void main ( String[] args){
        String n = " malayalam " ;

        String p = new StringBuilder ( n ).reverse ().toString();

       System.out.println( "palindrome : " + n.equals(p) );

    }
}
