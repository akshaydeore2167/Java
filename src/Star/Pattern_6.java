package Star;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=Sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(" ");

            }
            for (int k =i; k <=n; k++) {
                System.out.print("*");

            }
            System.out.println();


        }

        }
}
