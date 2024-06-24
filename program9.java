import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        // relational operator example
        Boolean cond = (age>=18);
        // if(age>=18){
        //     System.out.println("yes u can drive!");
        // }
        // else{
        //     System.out.println("no you cant drive!");
        // }

        // logical operator example
        System.out.println("are u still in school?(true/false): ");
        Boolean val = sc.nextBoolean();
        Boolean cond1 = (val != true);
        if(cond && cond1){
            System.out.println("yes u can drive!");
        }
        else{
            System.out.println("no you cant drive!");
        }
    }
}
