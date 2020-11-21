//main class

package src.JobSystem;


//person class


// urban class


 class Urban extends Person {
    private String cityName;
    private String locationName;
    private String occupationType;
    private int cityId;

    public Urban() {

    }

    public Urban(String name, int age, char gender, String residentialType, String cityName, String locationName, String occupationType, int cityId) {
        super(name, age, gender, residentialType);
        this.cityName = cityName;
        this.locationName = locationName;
        this.occupationType = occupationType;
        this.cityName = cityName;

    }
    public String getCityName(){
        return  this.cityName;
    }
    public  void setCityName(String cityName){
        this.cityName = cityName;
    }
    public String getLocationName(){
        return this.locationName;
    }
    public void setLocationName(String locationName){
        this.locationName =locationName;
    }
    public String getOccupationType(){
        return this.occupationType;
    }
    public  void setOccupationType(String occupationType){
        this.occupationType = occupationType;
    }
    public int getCityId(){
        return this.cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }


}






//rural class


//farmer class


//agri_bussiness class


//dairy farm class


//poultry farm class


//govt officer class


// bussiness man class


// doctor class


// teacher class


//college class


// university class

// The end.
