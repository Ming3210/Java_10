package B8;

public class Cat extends Animal {
    private String furColor;

    // Constructor
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    // Ghi đè phương thức makeSound
    @Override
    public String makeSound() {
        return "Meow Meow";
    }

    // Ghi đè phương thức displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
        System.out.println("Màu lông: " + furColor);
    }
}