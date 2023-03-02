package Core_Java._3_If_else_Control_Statements;

import java.util.Scanner;

public class _7_Switch_Examples {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
//        System.out.println("Enter the Month No");
//        int no = a.nextInt();
//        String month = "";
//
//        switch (no) {
//            case 1:
//                month = "Jan";
//                break;
//            case 2:
//                month = "feb";
//                break;
//            case 3:
//                month = "March";
//                break;
//            case 4:
//                month = "Apr";
//                break;
//            case 5:
//                month = "May";
//                break;
//            case 6:
//                month = "Jun";
//                break;
//            case 7:
//                month = "Jul";
//                break;
//            case 8:
//                month = "Aug";
//                break;
//            case 9:
//                month = "Sep";
//                break;
//            case 10:
//                month = "oct";
//                break;
//            case 11:
//                month = "Nov";
//                break;
//            case 12:
//                month = "dec";
//                break;
//        }
//        System.out.println(month);


        //Program for check it is vowel or constant.

        System.out.println("Enter the Char");
        char c=a.next().charAt(0);


        switch (c){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Constant");
                break;

        }
    }
}
