package B7;

public class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        setName(name);
        setId(id);
        setGpa(gpa);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Lỗi: Tên không được để trống.");
            this.name = "Unknown";
        } else {
            this.name = name.trim();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Lỗi: Mã sinh viên không được để trống.");
            this.id = "Unknown";
        } else {
            this.id = id.trim();
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4.0) {
            System.out.println("Lỗi: GPA phải nằm trong khoảng 0.0 đến 4.0. Gán giá trị mặc định là 0.0.");
            this.gpa = 0.0;
        } else {
            this.gpa = gpa;
        }
    }

    public String getDetails() {
        return "Name: " + name + ", ID: " + id + ", GPA: " + gpa;
    }
}