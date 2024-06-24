
public class practise36 {

    // question 2
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            String char1 = "*";
            String line = char1.repeat(i);
            System.out.println(line);
        }
    }

    // question 4
    static void pattern2(int n) {
        for (int i = n; i >= 1; i--) {
            String char1 = "*";
            String line = char1.repeat(i);
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        pattern1(4);
        System.out.println(" ");
        pattern2(4);
    }
}
