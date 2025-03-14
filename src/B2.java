//1. Kế thừa là gì? Lợi ích trong OOP
//Kế thừa (Inheritance) là cơ chế trong lập trình hướng đối tượng (OOP) cho phép một lớp (lớp con) thừa hưởng các thuộc tính và phương thức của một lớp khác (lớp cha). Nó giúp:
//
//Tái sử dụng mã: Không cần viết lại code đã có.
//Tổ chức code: Tạo cấu trúc phân cấp, dễ quản lý.
//Mở rộng chức năng: Lớp con có thể thêm hoặc sửa đổi hành vi từ lớp cha.
//2. Sự khác biệt giữa kế thừa và đóng gói
//Kế thừa: Tập trung vào việc chia sẻ và mở rộng tính năng giữa các lớp (quan hệ "is-a"). Ví dụ: "Xe đạp là một loại phương tiện".
//Đóng gói: Tập trung vào ẩn dữ liệu và kiểm soát truy cập (bảo vệ dữ liệu). Ví dụ: Thuộc tính private chỉ truy cập qua getter/setter.
//Khác biệt chính: Kế thừa liên quan đến quan hệ giữa các lớp, còn đóng gói liên quan đến cách bảo vệ dữ liệu trong một lớp.
//3. Ví dụ sử dụng extends
//java
//
//        Collapse
//
//Wrap
//
//        Copy
//class Vehicle { // Lớp cha
//    protected String brand = "Toyota";
//
//    public void honk() {
//        System.out.println("Beep beep!");
//    }
//}
//
//class Car extends Vehicle { // Lớp con kế thừa từ Vehicle
//    private int wheels = 4;
//
//    public void display() {
//        System.out.println("Hãng: " + brand + ", Số bánh: " + wheels);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.honk(); // Gọi phương thức từ lớp cha
//        myCar.display(); // Gọi phương thức từ lớp con
//    }
//}
//Kết quả:
//
//text
//
//        Collapse
//
//Wrap
//
//        Copy
//Beep beep!
//Hãng: Toyota, Số bánh: 4
//        4. Lợi ích và hạn chế
//Lợi ích:
//Tái sử dụng mã, giảm lặp code.
//Dễ dàng mở rộng hệ thống (thêm lớp con).
//Hỗ trợ đa hình (polymorphism).
//Hạn chế:
//Phụ thuộc chặt chẽ: Thay đổi lớp cha có thể ảnh hưởng lớp con.
//Không linh hoạt bằng composition (quan hệ "has-a").
//Dễ lạm dụng, dẫn đến hệ thống phức tạp nếu dùng quá nhiều tầng kế thừa.