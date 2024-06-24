
import java.util.Scanner;

public class practise37 {

    public static void sum(int n) {
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum += j;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n = sc.nextInt();
        sum(n);
    }
}
