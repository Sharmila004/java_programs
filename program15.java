
public class program15 {

    public static void main(String[] args) {

        // 3 ways of creating an array:
        // 1. declaration + memory allocation
        // int[] marks = new int[5];
        // 2. declaration and memory allocation
        // declaration
        int[] marks;
        // memmory allocation
        marks = new int[5];

        // 3. declaration+memory allocation+initialization
        // int marks [] = {10,12,15,19,22};
        marks[0] = 10;
        marks[1] = 12;
        marks[2] = 15;
        marks[3] = 19;
        marks[4] = 22;
        System.out.println(marks[4]);
    }
}
