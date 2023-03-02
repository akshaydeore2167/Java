package Java_Collections;

import java.util.HashSet;

public class _8_Hash_Set {
    public static void main(String[] args) {
        HashSet a=new HashSet();

        a.add( 10 );
        a.add( 20 );
        a.add( 12 );
        a.add( 90 );
        a.add( 66 );
        System.out.println(a);

        HashSet b=new HashSet();

        //addAll
        b.addAll( a );
        System.out.println(b);

        //removeAll
//        b.removeAll( b );
        b.removeAll( a );
        System.out.println(b);

    }
}
