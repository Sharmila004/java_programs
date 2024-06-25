
class rectangle {

    int length;
    int width;

    public rectangle() {
        length = 4;
        width = 5;
    }

    public rectangle(int len, int wid) {
        length = len;
        width = wid;
    }
}

public class practise47 {

    public static void main(String[] args) {
        rectangle rect1 = new rectangle();
        System.out.println("length:" + rect1.length);
        System.out.println("width:" + rect1.width);

        rectangle rect2 = new rectangle(4, 5);
        System.out.printf("length2: %d", rect2.length);
        System.out.printf("width2: %d", rect2.width);

    }
}
