package B9;



public class Employee {
    protected String name;
    protected String id;
    protected double salary;

    // Constructor không tham số
    public Employee() {
        this.name = "";
        this.id = "";
        this.salary = 0.0;
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Mã số: " + id + ", Lương: " + salary;
    }
}