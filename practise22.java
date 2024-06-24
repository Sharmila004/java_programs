
import java.util.Scanner;

public class practise22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (value of n): ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            int val = 2 * i;
            sum += val;
        }
        System.out.println(sum);
    }
}
