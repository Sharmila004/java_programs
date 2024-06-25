
class base {

    base() {
        System.out.println("i am a constructor in base");
    }

    base(int a) {
        System.out.println("i am an overloaded constructor in base with a value: " + a);
    }
}

class derived extends base {

    derived() {
        super();
        System.out.println("i am a constructor in derived");
    }

    derived(int a) {
        super(0);
        System.out.println("i am an overloaded constructor in derived with a value: " + a);
    }

    derived(int a, int b) {
        super(a);
        System.out.println("i am an overloaded constructor in derived with b value: " + b);
    }
}

class childofderived extends derived {

    public childofderived(int x, int y, int z) {
        super(x, y);
        System.out.println("i am an overloaded constructor in derived with z value: " + z);
    }

}

public class program29 {

    public static void main(String[] args) {
        base b1 = new base();
        base b2 = new base(1);

        derived d1 = new derived();
        derived d2 = new derived(2);
        derived d3 = new derived(4, 5);

    }
}
