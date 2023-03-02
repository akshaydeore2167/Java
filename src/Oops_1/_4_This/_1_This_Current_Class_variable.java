package Oops_1._4_This;
//this: to refer current class instance variable
class Add_1{
    int a;
    int b;//Instance Variable

    public void sum(int a,int b){
        this.a=a;
        this.b=b;




    }
    void display(){

        System.out.println(a+b);
    }

}
public class _1_This_Current_Class_variable {
    public static void main(String[] args) {
        Add_1 a1=new Add_1();
        a1.sum(10,20);

        a1.display();
    }


}
/*
-this is a reference variable that refers to the current object.
 */