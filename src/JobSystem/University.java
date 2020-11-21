package src.JobSystem;

public class University extends Teacher {

    private String universityName;
    private String departmentName;
    private String courseName;

    public University() {

    }

    public University(String name, int age, char gender, String residentialType,
                      String cityName, String locationName, String occupationType,
                      int cityId, int experience, String qualification, double payment,
                      String universityName, String departmentName, String courseName) {
        super(name, age, gender, residentialType, cityName, locationName, occupationType, cityId, experience, qualification, payment);
        this.universityName = universityName;
        this.departmentName = departmentName;
        this.courseName = courseName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
