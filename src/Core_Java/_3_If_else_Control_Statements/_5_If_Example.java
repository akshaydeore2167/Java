package Core_Java._3_If_else_Control_Statements;

import java.util.Scanner;

public class _5_If_Example {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
//        System.out.println("Enter Your Age");
//        int age=a.nextInt();
//        if (age>=18){
//            System.out.println("You are Adult");
//        }else {
//            System.out.println("You are Minor");
//        }



//        System.out.println("Enter Value of A1");
//        int a1=a.nextInt();
//        System.out.println("Enter Value of A2");
//        int a2=a.nextInt();
//
//        if (a1>a2){
//            System.out.println(a1 + " Is Greater");
//        } else if (a1==a2) {
//            System.out.println("Both the values are Equal ");
//
//        }else {
//            System.out.println(a2 +" Is Greater");
//        }


        System.out.println("Enter the Value of A1");
        int a1=a.nextInt();
        System.out.println("Enter the value of A2");
        int a2=a.nextInt();
        System.out.println("Enter the value of A3");
        int a3=a.nextInt();

   if (a1>a2 && a1>a3){
       System.out.println(a1+ " Is Greater");
   } else if (a2>a1 && a2>a3) {
       System.out.println(a2+ " Is Greater");

   } else if (a3>a1 && a3>a2) {
       System.out.println(a3+ " Is Greater");

   } else if (a1==a2 && a1==a3 && a2==a3) {
       System.out.println("Equal Numbers");

   }


    }
}
