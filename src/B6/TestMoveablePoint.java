package B6;

public class TestMoveablePoint {
    public static void main(String[] args) {
        // Tạo đối tượng Point
        Point point = new Point(1.0, 2.0);
        System.out.println("Point ban đầu: " + point);

        MoveablePoint moveablePoint = new MoveablePoint(3.0, 4.0, 2.5, 1.5);
        System.out.println("\nMoveablePoint ban đầu: " + moveablePoint);

        System.out.println("Thực hiện di chuyển lần 1:");
        moveablePoint.move();
        System.out.println("MoveablePoint sau khi di chuyển: " + moveablePoint);

        System.out.println("\nThay đổi tốc độ:");
        moveablePoint.setXSpeed(-1.0);
        moveablePoint.setYSpeed(0.5);
        System.out.println("MoveablePoint với tốc độ mới: " + moveablePoint);

        System.out.println("Thực hiện di chuyển lần 2:");
        moveablePoint.move();
        System.out.println("MoveablePoint sau khi di chuyển lần 2: " + moveablePoint);

        System.out.println("\nThay đổi tọa độ trực tiếp:");
        moveablePoint.setX(0.0);
        moveablePoint.setY(0.0);
        System.out.println("MoveablePoint sau khi thay đổi tọa độ: " + moveablePoint);
    }
}