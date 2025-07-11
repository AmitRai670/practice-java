package Com.practice;
import java.util.Scanner;
public class Nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String Department = sc.next();


        switch(empId){
            case 1:
                System.out.println("Amit");
                break;
            case 2 :
                System.out.println("Noway");
                break;
            case 3:
                switch(Department){
                    case "Name":
                        System.out.println("Amit");
                        break;
                    case "Department" :
                        System.out.println("Entc");
                        break;
                    case "month" :
                        System.out.println("4th");
                        break;
                    default :
                        System.out.println("Enter valid Department");
                }
                break;
                default:
                    System.out.println("Enter valid ID");
        }

    }
}
