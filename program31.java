
class Phone {

    public void showtime() {
        System.out.println("time is 8am");
    }

    public void on() {
        System.out.println("turning on phone");
    }
}

class SmartPhone extends Phone {

    public void music() {
        System.out.println("playing music . . .");
    }

    public void on() {
        System.out.println("turniong on smartphone");
    }
}

public class program31 {

    public static void main(String[] args) {
        // Phone obj = new Phone(); //allowed
        // SmartPhone smobj = new SmartPhone(); //allowed
        // obj.greet();
        // obj.name();

        Phone obj = new SmartPhone(); // allowed
        // SmartPhone obj1 = new Phone(); // not allowed
        obj.showtime();
        obj.on();
        // obj.music(); // not allowed
    }
}
