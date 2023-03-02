package Core_Java._5_Arrays;

public class Array_1 {
    public static void main(String[] args) {
        int a[]=new int[5];//Declaration.
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        for (int i = 0; i <= 4; i++) {
            System.out.println(a[i]);

        }

        for (int i:a) {
            System.out.println(i);
        }
        System.out.println(a.length);//to check size of an array.
    }
}
//Array is a set of elements which of same data type
//Array index always start from 0
