//main class

package src.JobSystem;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello My System");
    }
}


//person class

package Occupation;

public class Person {
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

package Occupation;

public class Urban extends Person {
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

package Occupation;

public class Rural extends  Person{
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

package Occupation;

public class Farmer extends  Rural {

    private  String agriFieldName;
    private double agriArea;
    private double cropsAmmount;
    private  int income;

    public Farmer(){

    }

    public  Farmer(String name , int age , char gender, String residentialType, String districtName, String villageName, String occupationName,String agriFieldName,double agriArea, double cropsAmmount, int income){
        super(name,age,gender,residentialType,districtName,villageName,occupationName);
        this.agriFieldName  =agriFieldName;
        this.agriArea = agriArea;
        this.cropsAmmount =cropsAmmount;
        this.income = income;
    }
    public  String getAgriFieldName(){
        return this.agriFieldName;
    }
    public  void setAgriFieldName(String agriFieldName){
        this.agriFieldName = agriFieldName;
    }
    public double getAgriArea(){
        return this.agriArea;
    }
    public void setAgriArea(double agriArea){
        this.agriArea = agriArea;
    }
    public  double getCropsAmmount(){
        return  this.cropsAmmount;
    }
    public  void setCropsAmmount(double cropsAmmount){
        this.cropsAmmount = cropsAmmount;
    }
    public int getIncome(){
        return this.income = income;
    }
    public  void  setIncome(int income){
        this.income  =income;
    }


}


//agri_bussiness class

package Occupation;

public class AgriBussiness extends Rural {
    private String bussinessType;
    private char bussinessSize;
    public  AgriBussiness(){

    }
    public AgriBussiness(String name , int age , char gender, String residentialType, String districtName, String villageName, String occupationName,String bussinessType,char bussinessSize){
        super(name,age,gender,residentialType,districtName,villageName,occupationName);
        this.bussinessType = bussinessType;
this.bussinessSize = bussinessSize;
    }
    public String getBussinessType(){
        return this.bussinessType = bussinessType;
    }
    public void setBussinessType(String bussinessType){
this.bussinessType = bussinessType;
    }
    public char getBussinessSize(){
        return this.bussinessSize;
    }
    public void setBussinessSize(){
        this.bussinessSize = bussinessSize;
    }
}




//dairy farm class

package Occupation;

public class DairyFarm extends AgriBussiness {
    private double farmArea;
   private int  blockSize ;
   private  int dairyCount;
   private double income;
   private double cost;
  public DairyFarm(){

  }
public DairyFarm(String name , int age , char gender, String residentialType, String districtName,
                 String villageName, String occupationName, String bussinessType, char bussinessSize,
                 double farmArea, int blockSize, int dairyCount , double income , double cost){
    super(name,age,gender,residentialType,districtName,villageName,occupationName,bussinessType,bussinessSize);
    this.farmArea = farmArea;
    this.blockSize = blockSize;
    this.dairyCount  =dairyCount;
    this.income  = income;
    this.cost = cost;

}

public double getFarmArea(){
      return  this.farmArea;
}
public  void setFarmArea(double farmArea){
      this.farmArea = farmArea;
}
public  int getBlockSize(){
      return  this.blockSize;
}
public  void  setBlockSize(int blockSize){
      this.blockSize = blockSize;
}
public  int getDairyCount(){
      return  this.dairyCount;
}
public  void  setDairyCount(int dairyCount){
      this.dairyCount = dairyCount;
}
public  double getIncome(){
      return  this.income;
}
public  void  setIncome(double income){
      this.income = income;
}
public  double getCost(){
      return this.cost;
}
public  void  setCost(double cost){
      this.cost = cost;
}

}




//poultry farm class

package Occupation;

public class PoultryFarm extends  AgriBussiness {
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


package Occupation;

public class GovtOfficer extends  Rural {

    private String officeName;
    private String title;
    private  int employeeId;
    private double income;
    public  GovtOfficer(){

    }
    public  GovtOfficer(String name , int age , char gender, String residentialType, String districtName, String villageName, String occupationName,String officeName,String title,int employeeId,double income){
        super(name,age,gender,residentialType,districtName,villageName,occupationName);
        this.officeName = officeName;
        this.title= title;
        this.employeeId = employeeId;
        this.income = income;

    }

    public  String getOfficeName(){
        return  this.officeName;
    }
    public  void  setOfficeName(String officeName){
        this.officeName = officeName;
    }
    public  String getTitle(){
        return  this.title  =title;
    }
    public  void  setTitle(String title){
        this.title = title;
    }
    public  int getEmployeeId(){
        return  this.employeeId;
    }
    public  void  setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public  double getIncome(){
        return this.income;
    }
    public  void  setIncome(double income){
        this.income = income;
    }
    
}

// bussiness man class

package Occupation;

public class BussinessMan extends Urban {
    private  String companyName;
    private  int employeeNumber;
    private double income;
    private  double profit;
    public  BussinessMan(){

    }
    public  BussinessMan(String name, int age, char gender, String residentialType,
                         String cityName, String locationName, String occupationType,
                         int cityId,String companyName , int employeeNumber, double income , double profit){
        super(name,age,gender,residentialType,cityName,locationName,occupationType,cityId);
        this.companyName  =companyName;
        this.employeeNumber = employeeNumber;
        this.income  =income;
        this.profit = profit;
    }
    public String  getCompanyName(){
        return  this.companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public  int getEmployeeNumber(){
        return  this.employeeNumber;
    }
    public  void  setEmployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }
    public double getIncome(){
        return this.income;
    }
    public  void  setIncome(double income){
        this.income = income;
    }
    public  double getProfit(){
        return  this.profit;
    }
    public  void setProfit(double profit){
        this.profit  =profit;
    }

}

// doctor class
package Occupation;

public class Doctor extends  Urban {

    private String hospitalName;
    private int patientNumber;
    private  int doctorID;
    private  double payment;
    public  Doctor(){


    }
    public  Doctor(String name, int age, char gender, String residentialType, String cityName,
                   String locationName, String occupationType, int cityId,String hospitalName,
                   int patientNumber,int doctorID, double payment){

        super(name,age,gender,residentialType,cityName,locationName,occupationType,cityId);
        this.hospitalName = hospitalName;
        this.patientNumber =patientNumber;
        this.doctorID = doctorID;
        this.payment = payment;

    }

    public  String  getHospitalName(){
        return  hospitalName;
    }
    public  void  setHospitalName(String hospitalName){
        this.hospitalName = hospitalName;
    }
    public  int getPatientNumber(){
        return patientNumber;
    }
    public void setPatientNumber(int patientNumber){
        this.patientNumber = patientNumber;
    }
    public int getDoctorID(){
        return  doctorID;
    }
    public  void  setDoctorID(int doctorID){
        this.doctorID =doctorID;
    }
    public  double getPayment(){
        return  payment;
    }
    public void setPayment(double payment){
        this.payment = payment;
    }
}



// teacher class

package Occupation;

public class Teacher extends  Urban {

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

package Occupation;

public class College extends  Teacher {

    private  String  collegeName;
    private  String subjectName;
    public  College(){

    }
    public  College(String name, int age, char gender, String residentialType,
                    String cityName, String locationName, String occupationType,
                    int cityId,int experience , String  qualification , double payment,String  collegeName ,String  subjectName){
        super(name,age,gender,residentialType,cityName,locationName,occupationType,cityId,experience,qualification,payment);
this.collegeName =collegeName;
this.subjectName = subjectName;
    }
    public  String getCollegeName(){
        return  collegeName;
    }
    public  void  setCollegeName(String collegeName){
        this.collegeName  =collegeName;
    }
    public  String getSubjectName(){
        return subjectName;
    }
    public  void  setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
}

// university class
package Occupation;

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
