package B8;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng tĩnh chứa 4 đối tượng Animal
        Animal[] animalList = new Animal[4];

        // Gán các đối tượng Dog và Cat vào mảng
        animalList[0] = new Dog("Buddy", 3, "Golden Retriever");
        animalList[1] = new Cat("Luna", 2, "Trắng");
        animalList[2] = new Dog("Max", 5, "Husky");
        animalList[3] = new Cat("Kitty", 1, "Đen");

        // Hiển thị danh sách
        System.out.println("Danh sách động vật:");
        for (Animal animal : animalList) {
            System.out.println("----------------");
            animal.displayInfo();
            System.out.println("Âm thanh: " + animal.makeSound());
        }
    }
}