
public class practise38 {

    public static void average(int... arr) {
        float average = 0;
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = sum / arr.length;
        }
        System.out.println(average);
    }

    public static void main(String[] args) {
        average(1);
        average(1, 2);
        average(1, 2, 3);
        average(1, 2, 3, 4);
    }
}
