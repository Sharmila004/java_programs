
public class program21 {

    static int sum(int... arr) {
        //  available as int [] arr
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the varargs section");
        System.out.println("The sum is " + sum());
        System.out.println("The sum of 4 and 5 is " + sum(4, 5));
        System.out.println("The sum of 3, 4, and 5 is " + sum(3, 4, 5));
        System.out.println("The sum of 2, 3, 4, and 5 is " + sum(2, 3, 4, 5));
    }
}
