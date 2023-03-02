package Core_Java._7_String_Methods;

import java.util.Scanner;

public class Compare_To {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First name");
        String name1= sc.nextLine();
        System.out.println("Enter Second Name ");
        String name2 = sc.nextLine();

        if (name1.compareTo(name2)==0){
            System.out.println("String are equal");

        } else if (name1.compareTo(name2)>1) {
            System.out.println("String 2 is greater");
        }
        else {
            System.out.println("String 1 is greater");
        }
    }
}
