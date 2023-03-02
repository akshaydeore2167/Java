package Core_Java._5_Arrays;

public class Array_Different_Data_Type {
    public static void main(String[] args) {
//        Object a[]=new Object[5];
//        a[0]=10;
//        a[1]=10.20;
//        a[2]="Akki";
//        a[3]="A";
//        a[4]=true;
        Object a[]={10,10.20,"Akshay","A",true};

        for (Object i:a) {
            System.out.println(i);

        }
    }
}
