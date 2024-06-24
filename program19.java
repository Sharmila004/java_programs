
public class program19 {

    static void change(int a) {
        a = 90;
    }

    static void change1(int[] arr) {
        arr[0] = 20;
    }

    static void tellJoke() {
        System.out.println("i invented java!");
    }

    public static void main(String[] args) {
        tellJoke();

        // changing the integer
        int x = 45;
        change(x);
        System.out.println(" the value of x after running change( is)" + x);

        // changing the array
        int[] marks = {1, 6, 4, 8, 10, 11};
        change1(marks);
        System.out.println(" the value of x after running change( is)" + marks[0]);

    }
}
