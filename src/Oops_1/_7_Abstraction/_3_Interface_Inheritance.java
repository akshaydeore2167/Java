package Oops_1._7_Abstraction;

interface A1{
    void print();
}
interface B1 extends A1{
    void show ();
}
class C implements B1{
    public void print(){
        System.out.println("Hello");

    }
    public void show(){
        System.out.println("Hii");
    }
}
public class _3_Interface_Inheritance {
    public static void main(String[] args) {
        C c1=new C();
        c1.print();
        c1.show();
    }
}
