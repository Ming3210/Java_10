package B8;

public  class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Hiển thị thông tin chung
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }

    // Âm thanh mặc định
    public String makeSound() {
        return "Some generic sound";
    }
}