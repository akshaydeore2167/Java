package Oops_1._5_Inheritance;

class Animal_1{
    public void eat(){
        System.out.println("Eating");
    }

}
class Cat extends Animal_1{
    public void meow(){
        System.out.println("Meowing");
    }

}
class Dog_1 extends Animal_1{
    public void shout(){
        System.out.println("Shouting");
    }

}


public class _4_Hierarchical_inheritance {
    public static void main(String[] args) {
        Cat C1=new Cat();
        C1.eat();
        C1.meow();

        Dog_1 D1=new Dog_1();
        D1.eat();
        D1.shout();
    }

}
//    When two or more classes inherits a single class, it is known as hierarchical inheritance.