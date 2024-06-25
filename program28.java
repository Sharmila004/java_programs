
class base {

    int x;

    // constructor
    public base() {
        System.out.println("i am a constructor in base class");
    }

    public int getx() {
        return x;
    }

    public void setx(int x) {
        System.out.println("i am setting x in the base now");
        this.x = x;
    }
}

class derived extends base {

    int y;

    // constructor
    public derived() {
        System.out.println("i am a constructor in derived class");
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        System.out.println("i am setting x in the base now");
        this.y = y;
    }
}

public class program28 {

    public static void main(String[] args) {
        base b = new base();
        b.setx(4);
        System.out.println(b.getx());

        derived d = new derived();
        d.setx(43);
        System.out.println(d.getx());
        d.sety(3);
        System.out.println(d.gety());
    }
}
