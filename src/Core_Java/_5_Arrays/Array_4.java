package Core_Java._5_Arrays;

import java.util.Scanner;

public class Array_4 {
    //Searching Num in a Array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int num = sc.nextInt();
        int num1 []=new int[num];

        for (int i = 0; i <num ; i++) {
            System.out.println("Enter the num "+i);
            num1[i]=sc.nextInt();


        }
        System.out.println("Enter the Value of x:");
        int x= sc.nextInt();
        for (int i = 0; i <num1.length ; i++) {
            if (num1[i]==x){
                System.out.println(x+"found at the index "+i);
            }

        }
    }
}
