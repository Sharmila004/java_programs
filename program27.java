
class MyEmployee {

    private int id;
    private String name;

    public MyEmployee() {
        id = 34;
        name = "jeevitha";
    }

    public MyEmployee(String myname) {
        id = 5;
        name = myname;
    }

    public MyEmployee(String myname, int myid) {
        id = myid;
        name = myname;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        // name = n;
        this.name = n;
    }

    public void setId(int i) {
        // id = i;
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class program27 {

    public static void main(String[] args) {
        MyEmployee jeev = new MyEmployee();
        MyEmployee me = new MyEmployee("sharmila");
        MyEmployee shar = new MyEmployee("sharmila", 4);

        System.out.println(jeev.getId());
        System.out.println(jeev.getName());
        System.out.println(shar.getId());
        System.out.println(shar.getName());
        System.out.println(me.getId());
        System.out.println(me.getName());
    }
}
