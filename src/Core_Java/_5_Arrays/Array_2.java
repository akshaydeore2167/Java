package Core_Java._5_Arrays;
//Another method of an array decalration
public class Array_2 {
    public static void main(String[] args) {
        int a[]={100,200,300,400,500};

        int sum =0;//For addition we declare variable.

        for (int i:a) {
            System.out.println(i);
            sum=sum+i;

        }
        System.out.println(sum);
    }
}
