package Java_Collections;

import java.util.HashSet;

public class _9_Hash_Set {
    public static void main(String[] args) {
        HashSet a=new HashSet();
        a.add( 1 );
        a.add( 2 );
        a.add( 3 );
        a.add( 4 );
        a.add( 5 );
        System.out.println(a);

        HashSet b=new HashSet();
        b.add( 3 );
        b.add( 4 );
        b.add( 5 );
        System.out.println(b);

        //Union -:remove all duplicate object and create unique values set
//        a.addAll( b );
//        System.out.println(a);

        //Intersection -:Find out common elements between two set.
//        a.retainAll( b );
//        System.out.println(a);

        //Difference between two set create the set of unmatched variables.
//        a.removeAll( b ) ;
//        System.out.println(a);

        //Subset-:all the elements in a b is present in the a then returns true else false.
        System.out.println( a.containsAll( b ));

    }
}
