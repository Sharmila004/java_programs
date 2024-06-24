// package package1;

import java.util.Scanner;

public class program2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println(num);
        System.out.println("Enter a number: ");
        boolean value = sc.hasNextInt();
        System.out.println(value);
    }
}
