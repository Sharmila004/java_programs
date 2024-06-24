// exercise 1
// calculation of percentage of a student in board exam

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        System.out.println("CBSE Board Percentage Calculator!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Math marks(out of 100): ");
        float math = sc.nextFloat();
        System.out.println("Enter Science marks(out of 100): ");
        float sci = sc.nextFloat();
        System.out.println("Enter Social Science marks(out of 100): ");
        float ss = sc.nextFloat();
        System.out.println("Enter Computer Science marks(out of 100): ");
        float cs = sc.nextFloat();
        System.out.println("Enter English marks(out of 100): ");
        float eng = sc.nextFloat();
        float percentage = (((math + sci + ss + cs + eng)/500)*100);
        System.out.println("The calculated percentage of the student is: ");
        System.out.println(percentage);
    }
}
