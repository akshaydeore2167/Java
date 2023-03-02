package Oops_1._2_Metod_Constructor;
//Taking Parameter

import java.util.Scanner;

class Add_2{
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
}
public class _2_Method_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        Add_2 a1=new Add_2();
        a1.add(n,m);

    }
}
