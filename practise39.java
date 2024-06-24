
import java.util.Scanner;

public class practise39 {

    // question 7
    public static void repeat4(int n) {
        if (n == 0) {
            System.out.println(4);
        } else {
            System.out.print(4);
            repeat4(n - 1);
        }
    }

    // question 8
    public static void repeat2(int n) {
        if (n == 0) {
            System.out.println(2);
        } else {
            System.out.print(2);
            repeat2(n - 1);
        }
    }

    // question 10
    public static void repeat3(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times u wnat to repeat the number: ");
        int n = sc.nextInt();
        repeat4(n);
        repeat2(n);
        repeat3(n);
    }
}
