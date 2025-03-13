package B5;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Hình tròn:");
        System.out.println("Bán kính: " + circle.getRadius());
        System.out.printf("Diện tích: %.2f%n", circle.getArea());

        Cylinder cylinder = new Cylinder(5.0, 10.0);
        System.out.println("\nHình trụ:");
        System.out.println("Bán kính: " + cylinder.getRadius());
        System.out.println("Chiều cao: " + cylinder.getHeight());
        System.out.printf("Diện tích đáy: %.2f%n", cylinder.getArea());
        System.out.printf("Thể tích: %.2f%n", cylinder.getVolume());

        System.out.println("\nThử đặt bán kính và chiều cao không hợp lệ:");
        cylinder.setRadius(-3.0);
        cylinder.setHeight(-5.0);
        System.out.println("Bán kính sau khi thử: " + cylinder.getRadius());
        System.out.println("Chiều cao sau khi thử: " + cylinder.getHeight());
        System.out.printf("Thể tích sau khi thử: %.2f%n", cylinder.getVolume());

        System.out.println("\nThay đổi giá trị hợp lệ:");
        cylinder.setRadius(2.0);
        cylinder.setHeight(3.0);
        System.out.println("Bán kính mới: " + cylinder.getRadius());
        System.out.println("Chiều cao mới: " + cylinder.getHeight());
        System.out.printf("Thể tích mới: %.2f%n", cylinder.getVolume());
    }
}