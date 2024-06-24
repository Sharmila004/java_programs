// else if clause

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age==18){
            System.out.println("It is time, you can now apply for a lisence!");
        }
        else if (age>18) {
            System.out.println("u may already have a lisence. if u dont then apply so you can drive");
        }
        else{
            System.out.println("wait until your 18 to apply for lisence");
        }
    }
}
