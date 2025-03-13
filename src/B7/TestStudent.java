package B7;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("Nguyen Van A", "SV001", 3.5);
        students[1] = new Student("", "SV002", 4.5);
        students[2] = new GraduateStudent("Tran Thi B", "SV003", 3.8, "AI Research", "ASSDA");
        students[3] = new GraduateStudent("Le Van C", "SV004", 2.9, "", null);

        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": " + students[i].getDetails());
            System.out.println();
        }

        System.out.println("Thử thay đổi thông tin:");
        students[0].setGpa(-1.0);
        students[2].setName("");
        ((GraduateStudent) students[3]).setResearchTopic("Machine Learning");

        System.out.println("\nDanh sách sinh viên sau khi thay đổi:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": " + students[i].getDetails());
            System.out.println();
        }
    }
}