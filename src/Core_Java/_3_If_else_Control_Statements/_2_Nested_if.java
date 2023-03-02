package Core_Java._3_If_else_Control_Statements;

public class _2_Nested_if {
    public static void main(String[] args) {
        int sal = 10000;
        if (sal > 1000) {
            if (sal > 15000) {
                System.out.println("You got promotion");
            } else {
                System.out.println("You Got Promotion");

            }

        } else {
            System.out.println("Work Hard");
        }
    }
}
