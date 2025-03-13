package B10;



public class Main {
    public static void main(String[] args) {
        Shape[] shapeList = new Shape[3];

        shapeList[0] = new Circle("Hình tròn", 5.0);
        shapeList[1] = new Rectangle("Hình chữ nhật", 4.0, 6.0);
        shapeList[2] = new Triangle("Tam giác", 3.0, 4.0, 5.0);

        System.out.println("=== DANH SÁCH CÁC HÌNH ===");
        for (int i = 0; i < shapeList.length; i++) {
            System.out.println("Hình " + (i + 1) + ":");
            System.out.println(shapeList[i].toString());
            System.out.println("========================");
        }
    }
}