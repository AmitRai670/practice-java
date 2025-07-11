package Com.practice;
import java.util.Scanner;
public class string {
//    public static void main(String[] args){
//      String massage = greet();
//      System.out.println(massage);
//    }
//
//    static String greet(){
//        String greeting = "Hello";
//    return greeting;
//    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String naam = Mygreet(s);
    System.out.println(naam);

    }
    static String Mygreet( String name){
        String massage = "hello "+name;
        return massage;
    }
}
