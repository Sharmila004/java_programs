
import java.util.Scanner;

public class practise19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year(yyyy): ");
        int year = sc.nextInt();

        Boolean condition1 = (year % 4 == 0);
        Boolean Condition2 = ((year % 100 != 0) || (year % 4 == 0));
        Boolean isLeapYear = (condition1 && Condition2);
        if (isLeapYear) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("it is not a leap year");
        }
    }
}
