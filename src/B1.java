//1. Tính đóng gói là gì? Tại sao quan trọng?
//Tính đóng gói (Encapsulation) là một nguyên tắc trong lập trình hướng đối tượng (OOP), nhằm ẩn dữ liệu (thuộc tính) của một đối tượng và chỉ cho phép truy cập thông qua các phương thức công khai (public methods). Nó quan trọng vì giúp bảo vệ dữ liệu, tăng tính bảo mật và giảm sự phụ thuộc giữa các phần của chương trình.
//
//2. Áp dụng tính đóng gói trong Java
//        Trong Java, tính đóng gói được thực hiện bằng cách:
//
//Đặt các thuộc tính ở chế độ private để ẩn chúng.
//Sử dụng phương thức getter (lấy giá trị) và setter (thiết lập giá trị) để truy cập và thay đổi thuộc tính một cách có kiểm soát.
//3. Ví dụ
//java
//
//        Collapse
//
//Wrap
//
//        Copy
//public class Person {
//    private String name;
//    private int age;
//
//    // Getter
//    public String getName() {
//        return name;
//    }
//
//    // Setter
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if (age > 0) { // Kiểm tra hợp lệ
//            this.age = age;
//        }
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("An");
//        person.setAge(25);
//        System.out.println("Tên: " + person.getName() + ", Tuổi: " + person.getAge());
//    }
//}
//4. Lợi ích
//Bảo vệ dữ liệu: Ngăn truy cập trực tiếp, tránh thay đổi ngoài ý muốn.
//Kiểm soát quyền truy cập: Setter có thể thêm logic kiểm tra (ví dụ: tuổi > 0).
//Dễ bảo trì: Thay đổi cách triển khai bên trong lớp không ảnh hưởng đến mã bên ngoài.