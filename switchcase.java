package Com.practice;
import java.util.Scanner;
public class switchcase {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
//        String  fruit = sc.next();
//
//        switch (fruit){
//            case "mango" :
//                System.out.println("King of fruits");
//                break;
//            case "apple" :
//                System.out.println("A red fruit");
//                break;
//            case "Banana" :
//                System.out.println("A seed less fruit ");
//                break;
//                case "orange" :
//                    System.out.println(" A gol fruit");
//                    break;
//            default:
//                System.out.println("invalid hai");
//        }


        int n= sc.nextInt();

        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
                case 6:
                    System.out.println("Friday");
                    break;
            case 7 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("enter a Valid input");
        }




    }
}
