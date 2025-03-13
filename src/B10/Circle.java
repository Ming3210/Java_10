package B10;


public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return String.format("Hình tròn: %s\n- Bán kính: %.2f\n- Diện tích: %.2f\n- Chu vi: %.2f",
                name, radius, calculateArea(), calculatePerimeter());
    }
}