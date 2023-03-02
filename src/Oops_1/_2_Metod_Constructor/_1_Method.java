package Oops_1._2_Metod_Constructor;


/*
Static Method
-No need to crate an object directly we can call the method
-A method that has static keyword is known as static method. In other words,
-a method that belongs to a class rather than an instance of a class is known as a static method
*/

import java.util.Scanner;

//Taking Parameter not return any value.

class Add_1{
    public static void sum(int a, int b){
        int c=a+b;
        System.out.println(c);

    }
}

public class _1_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        Add_1.sum(a,b);

    }
}
/*
-The method in Java is a collection of instructions that performs a specific task.
-It performs reusability of a code.
 */