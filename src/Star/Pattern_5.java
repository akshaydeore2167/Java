package Star;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = Sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= (n-1); j++) {
                System.out.print(" ");
            }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            System.out.println();



        }
    }
}
