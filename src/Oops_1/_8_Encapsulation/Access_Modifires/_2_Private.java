package Oops_1._8_Encapsulation.Access_Modifires;
class A{

    private void print(){
        System.out.println("Hiii");
    }
}
public class _2_Private {
    public static void main(String[] args) {
        A a1=new A();
        //We Cant invoked print method because it is private we cant aceess it.
    }
}
//Class cannot be private except nested class.