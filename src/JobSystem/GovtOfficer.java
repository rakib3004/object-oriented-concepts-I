package src.JobSystem;

class GovtOfficer extends Rural {

    private String officeName;
    private String title;
    private int employeeId;
    private double income;

    public GovtOfficer() {

    }

    public GovtOfficer(String name, int age, char gender, String residentialType, String districtName, String villageName, String occupationName, String officeName, String title, int employeeId, double income) {
        super(name, age, gender, residentialType, districtName, villageName, occupationName);
        this.officeName = officeName;
        this.title = title;
        this.employeeId = employeeId;
        this.income = income;

    }

    public String getOfficeName() {
        return this.officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getTitle() {
        return this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getIncome() {
        return this.income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

}
