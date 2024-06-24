
public class practise24 {

    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        int num = 10;
        for (int i = 10; i >= 1; i--) {
            int ans = i * num;
            System.out.printf("\n %d x %d = %d", num, i, ans);
        }
    }
}
