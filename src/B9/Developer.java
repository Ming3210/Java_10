package B9;


public class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
        super();
        this.programmingLanguage = "";
    }

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Mã số: " + id + ", Lương: " + salary + ", Ngôn ngữ lập trình: " + programmingLanguage;
    }
}