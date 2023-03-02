package Oops_1._5_Inheritance;

interface A{
    void print();
}
interface B{
    void print_1();
}
class C implements A,B{
    public void print(){
        System.out.println("Hello");
    }
    public void print_1(){
        System.out.println("Hii");
    }

}

public class _6_Multiple_Inheritance {
    public static void main(String[] args) {
        C c1=new C();
        c1.print();
        c1.print_1();
    }
}
