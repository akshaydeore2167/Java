package Core_Java._7_String_Methods;

import java.util.Scanner;

public class String_Builder {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your name");
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);

//        replace char in a string
        sb.setCharAt(0,'D');
        System.out.println(sb);

        //insert char/string
        sb.insert(0,'a');
        System.out.println(sb);

        //delete char/string
        sb.delete(0,1);
        System.out.println(sb);

        //append string
        sb.append('h');
        System.out.println(sb);
    }
}
//Strings are immutable so to overcome this issue we use string Builder