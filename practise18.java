
import java.util.Scanner;

public class practise18 {

    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(1 to 7): ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.err.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter a valid number (1 to 7)");
        }
    }
}
