
class Employee {

    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("my id is: " + id);
        System.out.println("my name is: " + name);
    }

    public int salary() {
        return salary;
    }
}

public class program25 {

    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry = new Employee(); // instantiating a new Employee object
        Employee john = new Employee();

        // setting attributes/properties
        harry.id = 12;
        harry.name = "hello";

        john.name = "hi";
        john.id = 17;

        int salary = john.salary();

        // printing the attributes/properties
        harry.printDetails();
        john.printDetails();
        System.out.println(salary);

    }
}
