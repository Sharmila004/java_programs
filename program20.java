
public class program20 {

    static void foo() {
        System.out.println("good morning!");
    }

    static void foo(int a) {
        System.out.println("good morning " + a);
    }

    public static void main(String[] args) {
        foo();
        int a = 3000;
        foo(a);
    }
}
