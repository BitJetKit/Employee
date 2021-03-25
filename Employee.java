package Employee;
/**
 * @author:BitJetKit
 * Title: Employee
 * Date: March 24, 2021
 * Purpose: Offer an employer an easy employee class: it can be called.
 */
public class Employee {
    // Declare the fields.
    private String id;
    private String name;
    private String department;
    private int age;

    // Declare the constructor options.
    public Employee(){

    }
    // Get the employee's id, name, and department; and age.
    public Employee(String id, String name, String department, int age){
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }
    // Declare the accessors.
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Declare the printer.
}