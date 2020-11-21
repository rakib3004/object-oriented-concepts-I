package src.JobSystem;

class Rural extends Person {
    private String districtName;
    private String villageName;
    private String occupationName;

    public Rural() {

    }

    public Rural(String name, int age, char gender, String residentialType, String districtName, String villageName, String occupationName) {
        super(name, age, gender, residentialType);
        this.districtName = districtName;
        this.villageName = villageName;
        this.occupationName = occupationName;
    }

    public String getDistrictName() {
        return this.districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getVillageName() {
        return this.villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getOccupationName() {
        return this.occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
    }

}
