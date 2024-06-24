
import java.util.Scanner;

public class practise35 {

    static void mutiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = i * n;
            System.out.printf("\n %d x %d = %d", n, i, result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n = sc.nextInt();
        mutiplicationTable(n);
    }
}
