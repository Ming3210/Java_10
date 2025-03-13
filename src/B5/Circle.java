package B5;

public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        setRadius(radius);
    }

    // Getter cho radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Lỗi: Bán kính không được âm. Gán giá trị mặc định là 0.");
            this.radius = 0;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
