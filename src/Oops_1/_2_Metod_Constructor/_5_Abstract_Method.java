package Oops_1._2_Metod_Constructor;
abstract class Demo{
    abstract void display();//Abstract Method
}
class New_1 extends Demo{
    @Override
    void display() {
        System.out.printf("Hii");
    }
}

public class _5_Abstract_Method {
    public static void main(String[] args) {
        Demo a=new New_1();
        a.display();
    }
}


/*
The method that does not has method body is known as abstract method. In other words, without an implementation is known as abstract method. It always declares in the abstract class. It means the class itself must
 be abstract if it has abstract method. To create an abstract method, we use the keyword abstract.
 */