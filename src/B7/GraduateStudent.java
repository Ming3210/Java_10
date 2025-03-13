package B7;

public class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    // Constructor
    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        setResearchTopic(researchTopic);
        setSupervisorName(supervisorName);
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        if (researchTopic == null || researchTopic.trim().isEmpty()) {
            System.out.println("Lỗi: Đề tài nghiên cứu không được để trống.");
            this.researchTopic = "No topic assigned";
        } else {
            this.researchTopic = researchTopic.trim();
        }
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        if (supervisorName == null || supervisorName.trim().isEmpty()) {
            System.out.println("Lỗi: Tên giảng viên hướng dẫn không được để trống.");
            this.supervisorName = "No supervisor assigned";
        } else {
            this.supervisorName = supervisorName.trim();
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Research Topic: " + researchTopic + ", Supervisor: " + supervisorName;
    }
}