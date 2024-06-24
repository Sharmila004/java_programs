
import java.util.Scanner;

public class practise23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int ans = i * num;
            System.out.printf("\n %d x %d = %d", num, i, ans);
        }
    }
}
