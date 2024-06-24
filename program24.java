
class Employee {

    int id;
    String name;
}

public class program24 {

    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry = new Employee(); // instantiating a new Employee object
        Employee john = new Employee();

        // setting attributes/properties
        harry.id = 12;
        harry.name = "hello";

        john.name = "hi";
        john.id = 17;

        // printing the attributes/properties
        System.out.println(harry.id);
        System.out.println(harry.name);
    }
}
