
class cellPhone {

    public void ring() {
        System.out.println("Ringing . . .");
    }

    public void vibrate() {
        System.out.println("Vibrating . . .");
    }
}

public class practise42 {

    public static void main(String[] args) {
        cellPhone p1 = new cellPhone();
        p1.ring();
        p1.vibrate();
    }
}
