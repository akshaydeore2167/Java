package Star;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = Sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j =4; j >=i ; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");

            }
            for (int l =2; l <=i ; l++) {
                System.out.print("*");

            }
            System.out.println();
        }

        }
    }