
import java.util.Scanner;

public class practise17 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your income: ");
            double income = sc.nextDouble();

            double tax = 0;

            if (income > 2.5 && income <= 5.0) {
                tax = (5.0 / 100.0) * (income - 2.5);
            } else if (income > 5.0 && income <= 10.0) {
                tax = (5.0 / 100.0) * (5.0 - 2.5) + (20.0 / 100.0) * (income - 5.0);
            } else if (income > 10.0) {
                tax = (5.0 / 100.0) * (5.0 - 2.5) + (20.0 / 100.0) * (10.0 - 5.0) + (30.0 / 100.0) * (income - 10.0);
            } else {
                System.out.println("You don't have to pay tax");
                return;
            }
            System.out.println("Tax is: " + tax);
        }
    }
}
