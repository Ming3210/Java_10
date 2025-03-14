package B3;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        int currentYear = 2025;
        if (year <= currentYear) {
            this.year = year;
        } else {
            System.out.println("Lỗi: Năm sản xuất " + year + " không hợp lệ. Năm phải nhỏ hơn hoặc bằng " + currentYear);
            this.year = currentYear;
        }
    }



}
