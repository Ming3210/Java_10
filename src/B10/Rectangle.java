package B10;


public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("Hình chữ nhật: %s\n- Chiều rộng: %.2f\n- Chiều cao: %.2f\n- Diện tích: %.2f\n- Chu vi: %.2f",
                name, width, height, calculateArea(), calculatePerimeter());
    }
}