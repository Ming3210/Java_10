package B8;

public class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Ghi đè phương thức makeSound
    @Override
    public String makeSound() {
        return "Woof Woof";
    }

    // Ghi đè phương thức displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
        System.out.println("Giống chó: " + breed);
    }
}