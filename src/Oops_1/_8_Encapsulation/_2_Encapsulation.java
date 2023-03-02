package Oops_1._8_Encapsulation;

class Student{

    private String name;

    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class _2_Encapsulation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Akshay");
        System.out.println(s1.getName());
    }
}
/*
Encapsulation in Java is a process of wrapping code and data together into a single unit
 */