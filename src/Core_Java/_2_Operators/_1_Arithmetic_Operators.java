package Core_Java._2_Operators;

/*
Operators:Operators in java is a symbols is used to perform operations.
Types:
1.Arithmetic:Addition +,Sub -,Mul *,Div /,Modulas %
2.Unary:1.Prefix:--exp,++exp 2.Postfix:exp++,exp--
3.Shift
4.Relational::Smaller than <,<=,Greater >,>=,==,!=
5.Bitwise.
6.Logical: !,&&,||
7.Ternary.
8.Assignment:+=,-=,*=,/=,%= (Associvity Right to Left).
 */
public class _1_Arithmetic_Operators {
    public static void main(String[] args) {

        //Associavity Left to Right
        //Precedence [* ,%,/]>[+,-]

        int a=10+20;
        int b=20-10;
        int c=20*10;
        int d=20/4;
        int e=40%4;

        float f=(float) 7/2;//Typecasting
        float g=7/2;
        int h=7/2;

        int x=2+(3-4)*5%8/4;//Bracket have higher precedence>>*,%,/>>+,-

        //Printing
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(x);



    }
}
