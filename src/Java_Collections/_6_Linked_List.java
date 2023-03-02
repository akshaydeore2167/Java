package Java_Collections;

import java.util.LinkedList;

//Stack and Queue Methods
public class _6_Linked_List {
    public static void main(String[] args) {

        LinkedList a=new LinkedList();

        a.add( "a" );
        a.add( "b" );
        a.add( "s" );
        a.add( "c" );

        System.out.println(a);

        //Adding object at the first positon
        a.addFirst( "Akshay" );
        a.addLast( "Deore" );
        System.out.println(a);

        //Get first and Last
        System.out.println(a.getFirst());
        System.out.println(a.getLast());

        //Remove First and Last object /element
        a.removeFirst();
        a.removeLast();
        System.out.println(a);

    }
}
