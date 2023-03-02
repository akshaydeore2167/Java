package Java_Collections;

import java.util.HashMap;

public class _12_Map {
    public static void main(String[] args) {
//        HashMap<Integer,String>a=new HashMap<Integer,String>();//in for each loop we need to mention data type.
        HashMap a=new HashMap();

        //Adding Pairs
        a.put( 1,"Akshay" );
        a.put( 2,"Sanjay" );
        a.put( 3,"Deore" );
        a.put( 4,"Umarane" );
        a.put( 5,"Deola" );
        a.put( 6,"Nashik" );
        System.out.println(a);

        //Get method to return the value of particular key
        System.out.println(a.get( 3 ));

        //Remove method remove a pair .
        a.remove( 3 );
        System.out.println(a);

        //Contains returns boolean value True or false

        System.out.println(a.containsKey( 1 ));
        System.out.println(a.containsValue( "Sanja" ));

        //isEmpty
        System.out.println(a.isEmpty());

        //Get Keys set from Hashmap and also read from for each loop
        System.out.println(a.keySet());

        //Get Values from Hashmap and also read from for each loop
        System.out.println(a.values());

        //Returns all sets and also read from for each loop
        System.out.println(a.entrySet());

        //Entry Interface Methods

        



    }
}
/*
1.Map inerface implemented by various classes but mainly used two classes.
   1.Hashmap.
   2.Hashtable.
2.combination of a key and value is called pair
3.If data is in the key and map format then we will go for the map interface.
4.Duplicates keys are not allowed in a map interface.
5.Duplicates values are allowed.
6.what are methods in map interface which are implemented in a hash map class.
7.Internally the hashmap is impemented by using underline data structure hashtable.
8.Insertion order is not preserved.
9.Null key allowed once,but multiple values are allowed.
10.hashmap is prefferd when more no of search operations.
11.Map is a collection of entries (entry means collection of key and value).
12.Hasmap Class have one sub interface called Entry intreface.
13.Every entry is represents by entry interface.
14.Also entry interface have number of methods,and we use that methods at the entries of the collection.

 */
