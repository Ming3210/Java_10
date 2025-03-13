package B9;



public class Main {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[3];

        employeeList[0] = new Employee("Nguyen Van A", "E001", 5000.0);
        employeeList[1] = new Manager("Tran Thi B", "M001", 7000.0, 2000.0);
        employeeList[2] = new Developer("Le Van C", "D001", 6000.0, "Java");

        System.out.println("Thông tin và lương của các nhân viên:");
        for (Employee emp : employeeList) {
            System.out.println("----------------");
            System.out.println(emp.toString());
            System.out.println("Lương thực nhận: " + emp.getSalary());
        }

        System.out.println("\nSau khi tăng lương cho Developer:");
        Developer dev = (Developer) employeeList[2];
        dev.increaseSalary(1000.0);

        System.out.println("----------------");
        System.out.println(dev.toString());
        System.out.println("Lương thực nhận: " + dev.getSalary());
    }
}