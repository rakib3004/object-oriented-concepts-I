package UserSection;

public class Account {
    private int accountHolderNumber;
    private  String accountHolderName;
    private   String accountHolderNID;
    private  String accountHolderAddress;
    private  String accountHolderPhone;
    private  String accountHolderPhoto;
    private  double balance;
    private  String accountHolderBalanceType;



  public  Account(String name ,String address ,String phone){
this.accountHolderName =name;
this.accountHolderAddress = address;
this.accountHolderPhone = phone;
this.accountHolderNID ="N/A";
this.accountHolderPhoto ="N/A";
  this.balance =0.0;

    }

    public  Account(String name ,String address ,String phone,String user_NID){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID =user_NID;;
        this.accountHolderPhoto ="N/A";
        this.balance =0.0;



    }




    public Account(String name ,String address ,String phone,String photo , String user_NID){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID =user_NID;
        this.accountHolderPhoto =photo;
        this.balance =0.0;


    }


    public double checkBalance(){
     return  this.balance;
    }
    public int checkAccounNumber(){
      return this.accountHolderNumber;
    }
    public String checkAccountHolderDetails(){

      return   this.accountHolderName +
        this.accountHolderAddress +
        this.accountHolderPhone +
        this.accountHolderNID +
        this.accountHolderPhoto ;

    }
    public  double withdraw(double ammount){

      double updateBalance = -1;
      if(this.balance-ammount>=100){

          updateBalance = this.balance - ammount;
      }


      else {
          updateBalance = -1;
      }
      
      return  updateBalance;

    }



}
