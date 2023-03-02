package Oops_1._1_Oops;

class Pen{
    String colour;
    String type;

    public void pen_info(){
        System.out.println(this.colour+" "+this.type);
        System.out.println("Writying Something");
    }
}

public class _2_Class_Object_this {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.colour="Black";
        pen1.type="Ballpen";
        pen1.pen_info();
    }
}
