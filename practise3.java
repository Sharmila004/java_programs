// greet the user by their name 

import java.util.Scanner;

public class practise3 {
    public static void main(String[] Args){
        System.out.println("Greeting program!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day");
    }
}
