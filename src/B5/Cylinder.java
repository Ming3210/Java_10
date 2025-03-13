package B5;

public class Cylinder extends Circle {
    private double height;



    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            System.out.println("Lỗi: Chiều cao không được âm. Gán giá trị mặc định là 0.");
            this.height = 0;
        }
    }

    public double getVolume() {
        return getArea() * height;
    }
}