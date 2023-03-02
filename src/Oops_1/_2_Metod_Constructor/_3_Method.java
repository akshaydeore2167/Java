package Oops_1._2_Metod_Constructor;

import java.util.Scanner;

//Method Take Parametre return Something
class Add_3{
    public int  add(int a,int b){
        int c=a+b;
        return c;
    }
}
public class _3_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        Add_3 a1=new Add_3();
        int s=a1.add(n,m);

        System.out.println(s);

    }
}
