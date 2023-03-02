package Core_Java._6_Input_From_User;

import java.util.Scanner;

public class _1_Input_From_User {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=a.nextLine();
        System.out.println("Enter Your Age");
        int age=a.nextInt();
        System.out.println("My Name is = "+ name);
        System.out.println("My age is = "+ age );
    }
}
