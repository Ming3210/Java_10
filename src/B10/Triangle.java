package B10;


public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return String.format("Tam giác: %s\n- Cạnh a: %.2f\n- Cạnh b: %.2f\n- Cạnh c: %.2f\n- Diện tích: %.2f\n- Chu vi: %.2f",
                name, a, b, c, calculateArea(), calculatePerimeter());
    }
}