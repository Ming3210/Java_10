package inheritance;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private boolean sex;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public void displayData(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Sex: " + (isSex()? "Male" : "Female"));
        System.out.println("Address: " + getAddress());
    }
    public void inputData(Scanner scanner){
        System.out.println("Ten: ");
        setName(scanner.nextLine());
        System.out.println("Tuoi: ");
        setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Gioi tinh (True/False): ");
        setSex(scanner.nextBoolean());
        scanner.nextLine();
        System.out.println("Dia chi: ");
        setAddress(scanner.nextLine());

    }
}
