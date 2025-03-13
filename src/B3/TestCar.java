package B3;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020);

        System.out.println("Thông tin xe ban đầu:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        System.out.println("\nThay đổi thông tin xe:");
        car.setMake("Honda");
        car.setModel("Civic");

        System.out.println("Thử đặt năm hợp lệ:");
        car.setYear(2023);
        System.out.println("Year sau khi thay đổi: " + car.getYear());

        System.out.println("\nThử đặt năm không hợp lệ:");
        car.setYear(2026);
        System.out.println("Year sau khi thử với năm không hợp lệ: " + car.getYear());

        System.out.println("\nThông tin xe cuối cùng:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}