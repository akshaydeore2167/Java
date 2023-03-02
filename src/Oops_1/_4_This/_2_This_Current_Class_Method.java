package Oops_1._4_This;

class Print{
    void m1(){
        System.out.println("m1");
    }

    void m2(){
        System.out.println("m2");
        this.m1();
    }

}
public class _2_This_Current_Class_Method {
    public static void main(String[] args) {
        Print p1=new Print();
        p1.m2();
    }
}
/*
-You may invoke the method of the current class by using the this keyword. If you don't use the this keyword,
compiler automatically adds this keyword while invoking the method.
 */