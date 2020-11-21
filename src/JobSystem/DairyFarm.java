package src.JobSystem;

class DairyFarm extends AgriBussiness {
    private double farmArea;
    private int blockSize;
    private int dairyCount;
    private double income;
    private double cost;

    public DairyFarm() {

    }

    public DairyFarm(String name, int age, char gender, String residentialType, String districtName,
                     String villageName, String occupationName, String bussinessType, char bussinessSize,
                     double farmArea, int blockSize, int dairyCount, double income, double cost) {
        super(name, age, gender, residentialType, districtName, villageName, occupationName, bussinessType, bussinessSize);
        this.farmArea = farmArea;
        this.blockSize = blockSize;
        this.dairyCount = dairyCount;
        this.income = income;
        this.cost = cost;

    }

    public double getFarmArea() {
        return this.farmArea;
    }

    public void setFarmArea(double farmArea) {
        this.farmArea = farmArea;
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    public int getDairyCount() {
        return this.dairyCount;
    }

    public void setDairyCount(int dairyCount) {
        this.dairyCount = dairyCount;
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

}
