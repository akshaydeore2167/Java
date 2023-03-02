package Oops_1._5_Inheritance;

class Animal {
        public void eat(){
                System.out.println("Eating .....");
        }

}

class Dog extends Animal {
        public void barking(){
                System.out.println("Barking .....");
        }

}

class Baby_Dog extends Dog{
        public void weeping(){
                System.out.println("Weeping ......");
        }

}


public class _3_Multilevel_inheritance {
        public static void main(String[] args) {
                Baby_Dog B1=new Baby_Dog();
                B1.eat();
                B1.barking();
                B1.weeping();
        }

}
