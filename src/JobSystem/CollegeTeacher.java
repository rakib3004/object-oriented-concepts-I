package src.JobSystem;

class CollegeTeacher extends Teacher {

    private String collegeName;
    private String subjectName;

    public CollegeTeacher() {

    }

    public CollegeTeacher(String name, int age, char gender, String residentialType,
                          String cityName, String locationName, String occupationType,
                          int cityId, int experience, String qualification, double payment, String collegeName, String subjectName) {
        super(name, age, gender, residentialType, cityName, locationName, occupationType, cityId, experience, qualification, payment);
        this.collegeName = collegeName;
        this.subjectName = subjectName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
