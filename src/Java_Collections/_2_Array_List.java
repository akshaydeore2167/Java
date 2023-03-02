package Java_Collections;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class _2_Array_List {
    public static void main(String[] args) {
        //Declare Arraylist
//         ArrayList <Integer> al=new ArrayList<Integer>();
//        List al= new List();
        ArrayList al=new ArrayList();

        //Add New Elements to the Arraylist.
        al.add(100);
        al.add("Welcome");
        al.add(10.20);
        al.add("c");
        al.add(true);
        System.out.println(al);

        //size()
        System.out.println("Number of array list elements:"+al.size());


        //remove
        al.remove(1);
            //or
        al.remove("Welcome");
        System.out.println(al);


        //Insert a new method
        al.add("Akshay");//add at the last position of list.
        al.add(2,"Deore");//add at the 2nd position .
        System.out.println(al);

        //retrive specific object.
        System.out.println(al.get(2));

        //replace element
        al.set(3,"Java");
        System.out.println(al);

        //Search-Contains
        System.out.println(al.contains("Akshay"));

        //Checkin list is empty or not
        System.out.println(al.isEmpty());

        //Printing all the values from the list

        for (Object e :al
             ) {
            System.out.println(e);
        }

        //Remove all
        al.removeAll(al);
        System.out.println(al);

        //Add all

        al.add("v");
        al.add("b");
        al.add("l");
        al.add("s");
        al.add("e");
        al.add("a");

        ArrayList al_1=new ArrayList();
        al_1.addAll(al);
        System.out.println(al_1);

        //Sorting List using collections.sort()

        Collections.sort(al_1);
        System.out.println(al_1);

        //Sorting in a reverse order.
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        //Shuffling order
        Collections.shuffle(al);
        System.out.println(al);



    }
}
/*
1.Array list is a class which derived all methods in a list interface.
2.Arraylist is growable means its default size is 10 if we add 11 elements its size become 11 .
3.We can store different types data.(Homgenious =same type data,Hetrogenious=Different type of data).
4.If we sort array list then list must have same type of data and we use collections sort method fot sorting the data.
5.When we inserting or deleting new object in a array list new array/lsi will be created old will be in a garbage
 */