package Oops_1._4_This;

class A{

    void A(){
        System.out.println("A");
    }
    void A(int x){
        System.out.println(x);
        this.A();
    }

        }
public class _3_This_Current_Class_Constructor {
    public static void main(String[] args) {
        A a1=new A();
        a1.A(2);
    }
}
