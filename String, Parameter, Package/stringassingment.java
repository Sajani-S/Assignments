
    public class stringassingment {
    public static void main ( String [] args) {

        String s = "mom";

        System.out.println( "lenth : " + s.length());
        System.out.println( "Upper Case : " + s.toUpperCase());
        System.out.println( "Lower Case :" + s.toLowerCase());
        String m = new StringBuilder (s) . reverse().toString();
        System.out.println( "reversed : "  +   m);
        System.out.println( "palindrome :" + s.equals(m));

         int count = 0 ;

         for(char c : s.toLowerCase().toCharArray()){

             if ( "aeiou".indexOf(c) != -1) count++ ;

         }
          System.out.println( "vowels : " +count);


        int counting = 0 ;

        for( char d : s.toLowerCase().toCharArray()){

            if("aeiou".indexOf(d) == -1)counting++;

        }
          System.out.println("consonants :" + counting);

    }
}
