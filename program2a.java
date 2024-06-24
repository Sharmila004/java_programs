// package package1;

import java.util.Scanner;

public class program2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum of the numbers you entered is: ");
        System.out.println(sum);
    }
}
