package Core_Java._3_If_else_Control_Statements;

import java.util.Scanner;

public class _4_Using_User_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a= sc.nextInt();
        System.out.println("Enter The value of b");
        int b=sc.nextInt();
        if (a>b){
            System.out.println("a is greater than b");
        } else if (a<b) {
            System.out.println("b is greater");

        }else {
            System.out.println("a equals to b");
        }

    }
}
