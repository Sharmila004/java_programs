
import java.util.Scanner;

public class practise40 {

    public static void convert(int cel) {
        double far = cel * 33.8;
        System.out.println("value in farenheit is" + far);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the celcius value: ");
        int val = sc.nextInt();
        convert(val);
    }
}
