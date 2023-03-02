package Java_Collections;

import java.util.LinkedList;

public class _4_Linked_List {
    public static void main(String[] args) {
        //Declaring Linked List
        LinkedList a = new LinkedList();

        //Add Object/Element.
        a.add( 100 );
        a.add( "Akshay" );
        a.add( "Deore" );
        a.add( "J" );
        a.add( 10.20 );
        a.add( true );
        System.out.println( a );

        //Size
        System.out.println( a.size() );

        //remove
        a.remove( 2 );
        a.remove( "Deore" );
        System.out.println( "After removing" + a );

        //insert value by default at last.
        a.add( "As" );
        System.out.println( a );

        //insert at the middle.
        a.add( 3, "all" );
        System.out.println( a );

        //retriving the object
        System.out.println( a.get( 2 ) );

        //replacing the existing value
        a.set( 1, "Deore" );
        System.out.println( a );

        //Contains
        System.out.println( a.contains( "Deore" ) );
        System.out.println( a.contains( "Deo" ) );

        //Checkin linked list is empty or not
        System.out.println( a.isEmpty() );

        //read all the data from linked list

//        for (Object e:a
//             ) {
//            System.out.println(e);
//        }

        for (int i = 0; i < a.size(); i++) {
            System.out.println( a.get( i ) );
        }

        //Remove all
//        a.removeAll( a );
//        System.out.println( a );




    }
}
/*
1.Linked list is a class which is implements methodds from list and d-queue interface.
2.For go to frequently retriving operations then go with Array list.
3.In insertion and deletion arraylist takes times.
4.For upper reason we prefferd Linked list class.
5.in linked list every element object is called as node.
6.Linked list mostly prefferd for develop stack and queue.
firest in first out is stack concept and first in last out is Queue concept.
7.null values are allowed in linked list and array list.
8.All methods of array list is also in linekd list and linked list also have their other methods.

 */