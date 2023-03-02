package Oops_1._7_Abstraction;

interface Sta{
    static void a(){
        System.out.println("Hii");
    }
}
class Stat implements Sta{
    public void b(){
        System.out.println("Hello");
    }
}
public class _5_Static_Method_Interface {
    public static void main(String[] args) {
        Stat s1=new Stat();
        s1.b();
//        s1.
    }
}


