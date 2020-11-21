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


 class Teacher extends  Urban {

    private  int experience;
    private  String qualification;
    private  double payment;
    public Teacher(){


    }

    public  Teacher(String name, int age, char gender, String residentialType,
                    String cityName, String locationName, String occupationType,
                    int cityId,int experience , String  qualification , double payment){
        super(name,age,gender,residentialType,cityName,locationName,occupationType,cityId);
this.experience =experience;
this.qualification =qualification;
this.payment= payment;
    }

    public  int getExperience(){
        return  experience;
    }
    public  void  setExperience(int experience){
        this.experience = experience;
    }
    public  String getQualification(){
        return  qualification;
    }
    public  double getPayment(){
        return payment;
    }
    public  void  setPayment(double payment){
        this.payment  =payment;
    }


}



//college class


// university class

public class University extends  Teacher {

    private  String universityName;
    private  String departmentName;
    private  String courseName;
    public  University(){

    }

    public University(String name, int age, char gender, String residentialType,
                      String cityName, String locationName, String occupationType,
                      int cityId,int experience , String  qualification , double payment,
                      String universityName, String departmentName, String courseName){
        super(name,age,gender,residentialType,cityName,locationName,occupationType,cityId,experience,qualification,payment);
this.universityName = universityName;
this.departmentName = departmentName;
this.courseName = courseName;
    }
    public  String getUniversityName() {
        return universityName;
    }
    public  void  setUniversityName(String universityName){
        this.universityName =universityName;
    }
    public String  getDepartmentName(){
        return departmentName;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }
    public String getCourseName(){
        return courseName;
    }
    public  void  setCourseName(String courseName){
        this.courseName =courseName;
    }
}
// The end.
