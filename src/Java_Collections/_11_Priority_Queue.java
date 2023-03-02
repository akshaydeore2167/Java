package Java_Collections;

import java.util.PriorityQueue;

public class _11_Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue a=new PriorityQueue();

        //Adding elements.
        a.add( "a" );
        a.add( "b" );
        a.add( "c" );
        a.add( "b" );

        a.offer( "h" );

        System.out.println(a);

        //get head element
        System.out.println(a.element());
        System.out.println(a.peek());

        System.out.println(a.element());//if list is empty throws no such element exception.
        System.out.println(a.peek());//if list is empty throws null .

        //return and remove element from queue.
        System.out.println(a.remove());//if queue is empty it throws no such element exception.
        System.out.println(a);

        System.out.println(a.poll());//if queue is empty it throws null.
        System.out.println(a);

        //Reading all the elements from the queue.
        for (Object e:a
             ) {
            System.out.println(e);
        }
    }
}
/*
1.Queue is a child interface of priority queue.
2.Deque,Bocking Deque,Blocking queue are thre child interface of queue.
3.Queue methods implemented by using classes 1.priority queue 2.Linked list.
4.Queue is kind of a collection which we represents group of elements which are prior to processing .
5.prior to processing means email send to a group then one another mail send to the group members as per list.
6.Queue is follow first in first out concept.
7.Linked list implements list and queue methods.
8.Priority queue implements queue methods.
9.in both the classes insertion order and duplicate data are allowed only difference is
10.hetrogenious data is allowed in a Linked list not in a priority queue.
11.Queue has 6 methods which is i plemented from both the classes.
    1.add()
    2.offer()
    3.element()
    4.peek().
    5.remove().
    6.poll().

 */
