package src.JobSystem;

class BussinessMan extends Urban {
    private String companyName;
    private int employeeNumber;
    private double income;
    private double profit;

    public BussinessMan() {

    }

    public BussinessMan(String name, int age, char gender, String residentialType,
                        String cityName, String locationName, String occupationType,
                        int cityId, String companyName, int employeeNumber, double income, double profit) {
        super(name, age, gender, residentialType, cityName, locationName, occupationType, cityId);
        this.companyName = companyName;
        this.employeeNumber = employeeNumber;
        this.income = income;
        this.profit = profit;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public double getIncome() {
        return this.income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getProfit() {
        return this.profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

}
