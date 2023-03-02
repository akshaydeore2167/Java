package Oops_1._7_Abstraction;

abstract class Animal {
    abstract void walk();


}

class Horse extends Animal {
    public void walk(){
        System.out.println("Walkig");
    }

}

public class _1_Abstraction {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
    }
}
/*
-A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract
and non-abstract methods (method with the body).

-Abstraction is a process of hiding the implementation details and showing only functionality to the user.

-There are two ways to achieve abstraction in java
  1.Abstract class (0 to 100%).
  2.Interface (100%).

-Rules for Abstract class

An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.

-If there is an abstract method in a class, that class must be abstract.
 */