package src.JobSystem;

class Farmer extends Rural {

    private String agriFieldName;
    private double agriArea;
    private double cropsAmmount;
    private int income;

    public Farmer() {

    }

    public Farmer(String name, int age, char gender, String residentialType, String districtName, String villageName, String occupationName, String agriFieldName, double agriArea, double cropsAmmount, int income) {
        super(name, age, gender, residentialType, districtName, villageName, occupationName);
        this.agriFieldName = agriFieldName;
        this.agriArea = agriArea;
        this.cropsAmmount = cropsAmmount;
        this.income = income;
    }

    public String getAgriFieldName() {
        return this.agriFieldName;
    }

    public void setAgriFieldName(String agriFieldName) {
        this.agriFieldName = agriFieldName;
    }

    public double getAgriArea() {
        return this.agriArea;
    }

    public void setAgriArea(double agriArea) {
        this.agriArea = agriArea;
    }

    public double getCropsAmmount() {
        return this.cropsAmmount;
    }

    public void setCropsAmmount(double cropsAmmount) {
        this.cropsAmmount = cropsAmmount;
    }

    public int getIncome() {
        return this.income = income;
    }

    public void setIncome(int income) {
        this.income = income;
    }


}
