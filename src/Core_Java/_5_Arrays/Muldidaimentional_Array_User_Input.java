package Core_Java._5_Arrays;

import java.util.Scanner;

public class Muldidaimentional_Array_User_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Value");
        int row= sc.nextInt();
        System.out.println("Enter Column Value");
        int col= sc.nextInt();
        int num[][]=new int[row][col];

        for (int i = 0; i <row ; i++) {
            System.out.println("Enter the Value");
            for (int j = 0; j <col ; j++) {

                num[i][j]=sc.nextInt();

            }

        }
        System.out.println("Enter The value of X");
        int x= sc.nextInt();
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if (num [i][j]==x){
                    System.out.println(x+ " Found at the location ("+ i +","+ j + ")");
                }

            }

        }

        for (int i[]:num) {
            for (int j:i) {
                System.out.print(j+" ");

            }
            System.out.println();

        }

    }
}
