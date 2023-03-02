package Core_Java._2_Operators;

public class _4_Unary_Operators {
    public static void main(String[] args) {
        int age=10;
        int vl=20;
//        Postfix
        System.out.println(age++);
        System.out.println(age);
        System.out.println(age--);
        System.out.println(age);
//        Prefix
        System.out.println(++vl);
        System.out.println(--vl);
    }
}
/*
prefix:First Incriment then perform operation
Postfix:First Perform operation then incriment
 */