package Oops_1._6_Polymorphism;


class Bank{
    int getRateOfInterest(){return 0;}
}
//Creating child classes.
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}
//Test class to create objects and call the methods
public class _3_Method_Overriding{
    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
/*
If subclass (child class) has the same method as declared in the parent class,
it is known as method overriding in Java

Rules for Java Method Overriding
1.The method must have the same name as in the parent class
2.The method must have the same parameter as in the parent class.
-We cant overriden the static method because It is because the static method is bound with class whereas
instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap
area.


*/