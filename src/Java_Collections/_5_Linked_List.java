package Java_Collections;

import java.util.Collections;
import java.util.LinkedList;

public class _5_Linked_List {
    public static void main(String[] args) {
        LinkedList a=new LinkedList();
        //add All
        a.add( 50);
        a.add( 10 );
        a.add( 12 );
        a.add( 90 );
        a.add( 3 );
        a.add( 8 );

        LinkedList b = new LinkedList();

        b.addAll( a );
        System.out.println(b);

        //Sort
        Collections.sort( b );
        System.out.println( b );

        //Sort in reverse order
        Collections.sort( b,Collections.reverseOrder() );
        System.out.println(b);

        //shuffle
        Collections.shuffle( b );
        System.out.println(b);
    }
}
