package Oops_1._7_Abstraction;
interface Pr{
    default void a(){
        System.out.println("Hi");
    }
}
class Pri implements Pr{
    public void b(){
        System.out.println("Hello");
    }

}
class _4_Dfault_Method_interface {
    public static void main(String[] args) {
        Pr p1=new Pri();
        p1.a();
        ((Pri) p1).b();
    }
}
// we can have method body in interface. But we need to make it default method. Let's see an