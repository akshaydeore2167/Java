package Oops_1._5_Inheritance;

class Employee{
    int salary=40000;


}
class Programmer extends Employee{
    int bonus=10000;

    public void total_salry(){
        System.out.println(bonus+salary);
    }
}
public class _2_Single_Inheritance {
    public static void main(String[] args) {
        Programmer p1=new Programmer();
        p1.total_salry();

    }
}
