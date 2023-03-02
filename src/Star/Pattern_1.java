package Star;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of n:\n");
        int n=Sc.nextInt();
        System.out.println("Enter the value of m:\n");
        int m=Sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
//                System.out.println("*");

            }
            System.out.println();

        }
    }
}
