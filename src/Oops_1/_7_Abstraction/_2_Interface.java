package Oops_1._7_Abstraction;

interface A{
    void print();
}

class B implements A{
    public void print(){
        System.out.println("Hello");
    }
}

public class _2_Interface {
    public static void main(String[] args) {
        B a1=new B();
        a1.print();
    }
}
/*
-An interface in Java is a blueprint of a class. It has static constants and abstract methods.
-you can say that interfaces can have abstract methods and variables. It cannot have a method body.
-The Java compiler adds public and abstract keywords before the interface method. Moreover, it adds public, static and final keywords before data members.
-Class To class we use extends keyword
-interface to class we use implements keyword.
-interface to interface we use extends keyword.

 */