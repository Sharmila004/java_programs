
import java.util.Scanner;

// question 3
class square {

    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return side * 4;
    }
}

// question 4
class rectangle {

    int length;
    int width;

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length * width);
    }
}

public class practise43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // question 3
        System.out.println("enter the side of square: ");
        int a = sc.nextInt();
        square sq = new square();
        sq.side = a;
        int sqarea = sq.area();
        System.out.println("area of the square: " + sqarea);
        int sqperimeter = sq.perimeter();
        System.out.println("perimeter of the square: " + sqperimeter);

        // question 4
        System.out.println("enter the length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("enter the width of rectangle: ");
        int w = sc.nextInt();
        rectangle rect = new rectangle();
        rect.length = l;
        rect.width = w;
        int rectarea = rect.area();
        System.out.println("area of the rectangle: " + rectarea);
        int rectperimeter = rect.perimeter();
        System.out.println("perimeter of the rectangle: " + rectperimeter);
    }
}
