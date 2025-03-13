package B4;

public class TestBook {
    public static void main(String[] args) {
        // Tạo một đối tượng Book
        Book book = new Book("Lập trình Java", "John Doe", 10.50);

        System.out.println("Thông tin sách ban đầu:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());

        System.out.println("\nThay đổi thông tin sách:");
        book.setTitle("Lập trình Python");
        book.setAuthor("Minh");

        System.out.println("Thử đặt giá hợp lệ:");
        book.setPrice(29.00);
        System.out.println("Price sau khi thay đổi: " + book.getPrice());


        book.setPrice(-15.00);
        System.out.println("Price sau khi thử với giá không hợp lệ: " + book.getPrice());

        System.out.println("\nThông tin sách cuối cùng:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
    }
}