import java.util.Iterator;
import java.util.HashMap;

public class HashMapDemo
{
    public static void main( String[] args )
    {
        HashMap <Integer, String> map = new HashMap <Integer, String> ();
        map.put( new Integer( 2 ), "two" );
        map.put( new Integer( 4 ), "four" );
        System.out.println( map );
        System.out.println();
        System.out.println( "Πρόσβαση στα περιεχόμενα του HashMap" );
        System.out.println( "map.get( 2 ) = " + map.get( new Integer( 2 ) ) );
        System.out.println( "map.get( 5 ) = " + map.get( new Integer( 5 ) ) );
        System.out.println( "map = " + map );
        System.out.println();
        Iterator<Integer> keySetIterator = map.keySet().iterator();
        while ( keySetIterator.hasNext() ) {
            Integer key = keySetIterator.next();
            System.out.println( "Κλειδί: " + key + " Τιμή: " + map.get(key));
        }
        System.out.println();
        System.out.println( "Δεν μπορεί να προστεθεί νέα τιμή με το ίδιο κλειδί" );
                Object value = map.put( new Integer( 8 ), "eight" );
        if ( value != null )
            System.out.println( "Δεν προστέθηκε το κλειδί 8" );
        else
            System.out.println( "Προστέθηκε το 8" );
        System.out.println( "map = " + map );
        value = map.put( new Integer( 2 ), "TWO" );
        if ( value != null )
            System.out.println( "Δεν προστέθηκε το κλειδί 2" );
        else
            System.out.println( "Προστέθηκε το 2" );
        System.out.println( "map = " + map );
        System.out.println();
        System.out.println( "Πως γίνεται τροποποίηση της τιμής" );
        map.put( new Integer( 4 ), "FOUR" );
        System.out.println( "map = " + map );
    }
}
