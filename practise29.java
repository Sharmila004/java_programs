
import java.util.Scanner;

public class practise29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("enter the value for position %d", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("eneter a number tp check if it is there is the array: ");
        int num = sc.nextInt();
        Boolean itsthere = false;
        for (int element : arr) {
            if (num == element) {
                itsthere = true;
                break;
            }
        }
        if (itsthere) {
            System.out.println("is present");
        } else {
            System.out.println("is not present");
        }
    }
}
