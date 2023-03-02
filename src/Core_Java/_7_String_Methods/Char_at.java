package Core_Java._7_String_Methods;

import java.util.Scanner;

public class Char_at {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Full name");
        String name= sc.nextLine();

        System.out.println(name);

        for (int i = 0; i <name.length() ; i++) {
            System.out.println(name.charAt(i));

        }
    }
}
