package Oops_1._2_Metod_Constructor;

class Pen_1{
    String colour;
    String type;

    public void pen_info(){
        System.out.println(this.colour+" "+this.type);
        System.out.println("Writying Something");
    }

    //Non-parametarised constructor.
//    Pen_1(){
//        System.out.println("Non-parametarised constructor");
//    }

      //Parametarised Constructor
//    Pen_1(String colour,String type){
//        this.colour=colour;
//        this.type=type;

      //Copy Constructor
      Pen_1(Pen_1 p2){
          this.colour=colour;
          this.type=type;
    }
    Pen_1(){

    }
}

public class _6_Constructor {
    public static void main(String[] args) {
           //Non-Parametarised
//        Pen_1 p1=new Pen_1();
//        p1.colour="Green";
//        p1.type="Gel_pan";
//        p1.pen_info();

          //Parametarised
//        Pen_1 p1=new Pen_1("Black","Ballpen");
//        p1.pen_info();

          //Copy constructor
        Pen_1 p1=new Pen_1();
        p1.colour="Black";
        p1.type="Ball";


        Pen_1 p2=new Pen_1(p1);
        p1.pen_info();

    }


}
/*
1)Constructor is a kind of method but it should have same name as class.
2)Constructor is automatically called at the time of object creation.
3)By default constructor do not return any value that why we no need to write void
4)Three types of constructors parametarised ,non-parametarised constructor,copy constructor.
5)Constructor is public or private or protected or default.

 */