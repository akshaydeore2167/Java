package Oops_1._6_Polymorphism;

class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
public class _1_Method_Overloading{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }}
/*
If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

1)If class contains more than one method with the same name is known as method overloading.
2)Rules for Method overloading as well ass Constructor Overloading.
  1.Number of parameter different.
  2.Order of parameter different i.e change in  sequence) this if Number of parameter is same.
  3.Data types of parameter should be different.(If above two criteria same then this rule applicable.

-Oveloading is a compile time polymorphism
-Overriding is a run time polymorphism.

 */