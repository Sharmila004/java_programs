
class Employee {

    String name;
    int salary;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        name = newname;
    }
}

public class practise41 {

    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee harry = new Employee();
        Employee john = new Employee();

        john.name = "hi";
        john.salary = 15000;

        String name = john.getName();
        System.out.println(name);
        int salary = john.getSalary();
        System.out.println(salary);

        john.setName("John");
        System.out.println(john.name);

    }
}
