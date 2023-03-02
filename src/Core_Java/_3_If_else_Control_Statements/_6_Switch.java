package Core_Java._3_If_else_Control_Statements;

import java.util.Scanner;

public class _6_Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Grade in Capital Letter:");
        char grade=sc.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Better");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Enough");
                break;
            default:
                System.out.println("Failed");
        }

    }
}
/*
Switch is similar to else if ladder
Possible data type used in a switch case:
1.Int
2.char
3.Byte
4.String.
5.Enum.

in a floating point or in a object case simply use else if ladder.
 */