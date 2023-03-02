package Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class _3_Array_List {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,};
        for (int value:arr
             ) {
            System.out.println(value);

        }

        ArrayList al=new ArrayList( Arrays.asList(arr));
        System.out.println(al);
    }
}
