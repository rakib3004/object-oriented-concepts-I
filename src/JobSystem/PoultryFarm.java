package src.JobSystem;

class PoultryFarm extends AgriBussiness {
    private double farmArea;
    private int rowSize;
    private int poultryCount;
    private double income;
    private double cost;
    private int lightNumber;

    public PoultryFarm(String name, int age, char gender, String residentialType, String districtName,
                       String villageName, String occupationName, String bussinessType, char bussinessSize,
                       double farmArea, int rowSize, int poultryCount, double income, double cost, int lightNumber) {
        super(name, age, gender, residentialType, districtName, villageName, occupationName, bussinessType, bussinessSize);
        this.farmArea = farmArea;
        this.rowSize = rowSize;
        this.poultryCount = poultryCount;
        this.income = income;
        this.cost = cost;
        this.lightNumber = lightNumber;
    }

    public double getFarmArea() {
        return this.farmArea;
    }

    public void setFarmArea(double farmArea) {
        this.farmArea = farmArea;

    }

    public int getRowSize() {
        return this.rowSize;
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    public int getPoultryCount() {
        return this.poultryCount;
    }

    public void setPoultryCount(int poultryCount) {
        this.poultryCount = poultryCount;
    }

    public double getIncome() {
        return this.income;

    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getCost() {
        return this.cost;

    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLightNumber() {
        return this.lightNumber;
    }

    public void setLightNumber(int lightNumber) {
        this.lightNumber = lightNumber;
    }

}
