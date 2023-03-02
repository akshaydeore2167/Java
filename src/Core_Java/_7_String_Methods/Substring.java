package Core_Java._7_String_Methods;

public class Substring {
    public static void main(String[] args) {
        String  a="Akshay";
        System.out.println(a.substring(0,2));
    }
}
//Excludes the last position for example
//Akshay
//012345
//We are taking sustring of 0-2 so Aks but it excludes last char 's' o/p shows 'Ak'