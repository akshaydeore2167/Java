package Core_Java._7_String_Methods;

public class Conactination {
    public static void main(String[] args) {
        String a="Akshay";
        String b=" Snajay";
        String c=" Deore";

        System.out.println(a+ b+ c);
        System.out.println(a.concat(b).concat(c));
        System.out.println("Akshay"+" Sanjay"+" Deore");
        System.out.println("Akshay".concat(b).concat(c));
    }
}
