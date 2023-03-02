package Core_Java._5_Arrays;

import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Array Size");
        int size=sc.nextInt();
        int num []=new int[size];

        for (int i=0;i<size;i++) {
            System.out.println("Enter the Num "+i);
            num[i]= sc.nextInt();

        }

        for (int i:num) {
            System.out.println(i);

        }


    }
}
