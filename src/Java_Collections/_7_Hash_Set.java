package Java_Collections;

import java.util.HashSet;

public class _7_Hash_Set {
    public static void main(String[] args) {
        //Declaration
//        HashSet a=new HashSet(100, 0.80F );//Initiate Capacity equlas to 100 and load factor 0.75
//        HashSet a=new HashSet(20);//Initiate the capacity equals to 20
//        HashSet <Integer>a=new HashSet<Integer>();//for homogenious data defining the data type.
        HashSet a = new HashSet();//Default

        //Add Element/Object
        a.add( 100 );
        a.add( "Aksahy" );
        a.add( "A" );
        a.add( 10.20 );
        a.add( true );
        System.out.println( a );

        //Remove

        a.remove( 10.20 );
        System.out.println( a );

        //Contains

        System.out.println( a.contains( 10.20 ) );

        //is Empty

        System.out.println( a.isEmpty() );

        //Read all the elements

        for (Object e : a) {
            System.out.println( e );

        }


    }
}
/*
1.Duplication not allowed and insertion order not preserved in this two cases we go for hashset/
2.Hashset insert the element by using Hashcode concept.
3.Searching of element is very faster beacuse it is using hascode concept for inserting the elements.
4.There is no index concept.
5.Hetrogeneious data support .
6.Null Values are allowed.
7.If we want to perform more no of search operations then go for hashset  because searching will be very fast.
8.Initial size hash set allocate 16 locations
9.in hash set 0.75 list is filled then immediately create a new list old is eligible for garbage.
10.Whwtever methods in a hash set will be eligible for also hash set and there is no another  methods for Hash set.
11.on Hash set we cannot aplly sort and shuffling directly because Hash set store element randomly .
12.if we want to perform/apply sort and shuffle methods then we have to convert Hash set into the
 Array list or linked list.
13.We cant update particular object or print.
 */