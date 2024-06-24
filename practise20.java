
import java.util.Scanner;

public class practise20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website with its url (.com, .org, .in): ");
        String website = sc.nextLine();
        Boolean commercial = website.endsWith(".com");
        Boolean organization = website.endsWith(".org");
        Boolean indian = website.endsWith(".in");
        if (commercial) {
            System.out.println("It is a commercial website");
        } else if (organization) {
            System.out.println("It is an organizational website");
        } else if (indian) {
            System.out.println("It is an indian website");
        } else {
            System.out.println("invalid url");
        }
    }
}
