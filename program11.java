import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are an adult");
                break;
            case 21:
                System.out.println("you are 2 years past for adult");
                break;
            case 60:
                System.out.println("you are entering old age");
                break;
            default:
                System.out.println("Enjoy yout life!");
        }
        
        // enhanced switch syntax
        // switch(age){
        //     case 18 -> {
                    // System.out.println("you are an adult");
                    // System.out.println("you are an adult");
                    // System.out.println("you are an adult");
                //}   
        //     case 21 -> System.out.println("you are 2 years past for adult");
        //     case 60 -> System.out.println("you are entering old age");
        //     default -> System.out.println("Enjoy yout life!");
        // }

    }
}
