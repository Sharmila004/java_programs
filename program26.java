
class MyEmployee {

    private int id;
    private String name;

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

public class program26 {

    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();

        // when id and name are private in MyEmployee class
        // harry.id = 12;
        // harry.name = "hello!"; 
        // the above throws error due to id and name having private access modifier
        harry.setName("hiiii");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());

    }
}
