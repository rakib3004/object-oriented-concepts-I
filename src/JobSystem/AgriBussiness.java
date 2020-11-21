package src.JobSystem;

class AgriBussiness extends Rural {
    private String bussinessType;
    private char bussinessSize;

    public AgriBussiness() {

    }

    public AgriBussiness(String name, int age, char gender, String residentialType, String districtName, String villageName, String occupationName, String bussinessType, char bussinessSize) {
        super(name, age, gender, residentialType, districtName, villageName, occupationName);
        this.bussinessType = bussinessType;
        this.bussinessSize = bussinessSize;
    }

    public String getBussinessType() {
        return this.bussinessType = bussinessType;
    }

    public void setBussinessType(String bussinessType) {
        this.bussinessType = bussinessType;
    }

    public char getBussinessSize() {
        return this.bussinessSize;
    }

    public void setBussinessSize() {
        this.bussinessSize = bussinessSize;
    }
}
