//main class

package src.JobSystem;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello My System");
    }
}


//person class

 class Person {
    private String name;
    private int age;
    private char gender;
    private String residentialType;
    public Person(){

    }
    public Person(String name , int age , char gender, String residentialType){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.residentialType  =residentialType;


    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;

    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;

    }
    public char getGender(){
        return this.gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public String getResidentialType(){
        return this.residentialType;
    }
    public void setResidentialType(String residentialType){
        this.residentialType = residentialType;
    }
}


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


 class Rural extends  Person{
    private String districtName;
    private  String villageName;
    private String occupationName;
    public Rural(){

    }
    public Rural(String name , int age , char gender, String residentialType, String districtName, String villageName, String occupationName){
        super(name,age,gender,residentialType);
        this.districtName = districtName;
        this.villageName  =villageName;
        this.occupationName  = occupationName;
    }

    public String getDistrictName(){
        return this.districtName;
    }
    public void setDistrictName(String districtName){
        this.districtName = districtName;
    }
    public String getVillageName(){
        return this.villageName;
    }
    public void setVillageName(String villageName){
        this.villageName  =villageName;
    }
    public String getOccupationName(){
        return  this.occupationName;
    }
    public void setOccupationName(String occupationName){
        this.occupationName = occupationName;
    }

}


//farmer class


//agri_bussiness class


//dairy farm class


//poultry farm class


 class PoultryFarm extends  AgriBussiness {
    private double farmArea;
    private int  rowSize ;
    private  int poultryCount;
    private double income;
    private double cost;
    private int lightNumber;
    public PoultryFarm(String name , int age , char gender, String residentialType, String districtName,
                     String villageName, String occupationName, String bussinessType, char bussinessSize,
                     double farmArea, int rowSize, int poultryCount , double income , double cost, int lightNumber) {
        super(name, age, gender, residentialType, districtName, villageName, occupationName, bussinessType, bussinessSize);
this.farmArea = farmArea;
this.rowSize = rowSize;
this.poultryCount = poultryCount;
this.income = income;
this.cost = cost;
this.lightNumber= lightNumber;
    }
    public double getFarmArea(){
        return  this.farmArea;
    }
    public  void  setFarmArea(double farmArea){
        this.farmArea = farmArea;

    }
    public  int getRowSize(){
        return  this.rowSize;
    }
    public  void  setRowSize(int rowSize){
        this.rowSize  =rowSize;
    }
    public  int getPoultryCount(){
        return  this.poultryCount;
    }
    public  void  setPoultryCount(int poultryCount){
        this.poultryCount = poultryCount ;
    }
    public  double getIncome(){
        return  this.income;

    }
    public  void setIncome(double income){
        this.income = income;
    }
    public  double getCost(){
        return  this.cost;

    }
    public  void  setCost(double cost){
        this.cost = cost;
    }
    public  int getLightNumber(){
        return  this.lightNumber;
    }
    public  void setLightNumber(int lightNumber){
        this.lightNumber = lightNumber;
    }

    }

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
