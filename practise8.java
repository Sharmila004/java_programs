import java.util.Scanner;

public class practise8 {
    public static void main(String[] args) {
        int a = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        boolean result = a>b;
        System.out.println(result);
    }
}
