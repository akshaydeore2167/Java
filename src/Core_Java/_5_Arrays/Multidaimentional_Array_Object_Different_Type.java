package Core_Java._5_Arrays;

public class Multidaimentional_Array_Object_Different_Type {
    public static void main(String[] args) {
        Object a[][]={{10,"A",30},{"Akki","Sanjay","Deore"},{"A","S","D"},{1.2,1.3,1.4},{true,false,true}};

        for (Object i[]:a) {
            for (Object j:i) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
}
