// package package1;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println(num);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the numbers you entered is: ");
        System.out.println(sum);
    }
}
