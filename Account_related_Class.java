package UserSection;


import javax.swing.*;
package UserSection;

import javax.swing.*;

public class BankingSystem {
    public static void main(String[] args) {

        Account user_account_1 = new Account("BSSE1129","IITDU","01736378019");

        user_account_1.deposit(1500);
        user_account_1.deposit(260);
        JOptionPane.showMessageDialog(null,user_account_1.checkAccounNumber());
        JOptionPane.showMessageDialog(null,user_account_1.checkBalance());

    }
}


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
    public  boolean withdraw(double ammount){
      if(ammount<=0.0){
          JOptionPane.showMessageDialog(null,"Enter Positive Amount");
          return  false ;
      }
     else if(this.balance-ammount<100){
          JOptionPane.showMessageDialog(null,"Balance Limit Cross");
          return  false ;
     }
     else {
          JOptionPane.showMessageDialog(null,"Withdraw Successful!!!!!!");
          this.balance = this.balance - ammount ;
 return  true ;
      }

    }


    public boolean deposit(double ammount){

        if(ammount<=0.0){
            JOptionPane.showMessageDialog(null,"Enter Positive Amount");
            return  false ;
        }
        else  {
            this.balance = this.balance + ammount ;
            JOptionPane.showMessageDialog(null,"Deposit Successful!!!!!!");
            return  true ;

        }


    }


}
