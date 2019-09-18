package UserSection;


import javax.swing.*;


public class BankingSystem {
    public static void main(String[] args) {

        Account user_account_1 = new Account("1129","4575","01736378019","user_photo","20161819");
        Account user_account_2 = new Account("11227","4675","01736458019","user_photo1","10161819");


        Account array_0f_account[] = new Account[10];

        array_0f_account[0] = user_account_1;
        array_0f_account[1] = user_account_2;
        array_0f_account[2] = new Account("1427","44575","017352468019","user_photo12","10161789");

//        JOptionPane.showMessageDialog(null,array_0f_account[0].checkAccountNumber());
//        JOptionPane.showMessageDialog(null,array_0f_account[1].checkAccountNumber());
//        JOptionPane.showMessageDialog(null,array_0f_account[2].checkAccountNumber());
        for (int counter =0;counter<3;counter++){
            JOptionPane.showMessageDialog(null,array_0f_account[counter].checkAccountHolderDetails());
        }

        for(Account temp_acoount : array_0f_account){
            JOptionPane.showMessageDialog(null,temp_acoount.checkAccountNumber());
        }

       /* String input_from_user = JOptionPane.showInputDialog("Enter Your amount for deposit :");
        int amount = Integer.parseInt(input_from_user);
        user_account_1.deposit(amount );

        input_from_user = JOptionPane.showInputDialog("Enter Your amount to withdraw :");
        amount = Integer.parseInt(input_from_user);
        user_account_1.withdraw(amount);

        JOptionPane.showMessageDialog(null,user_account_1.checkAccountHolderDetails());
        JOptionPane.showMessageDialog(null,user_account_1.checkAccountNumber());
        //JOptionPane.showMessageDialog(null,user_account_1.checkBalance());*/
    }
}




package UserSection;
import javax.swing.*;

public class Account {
    private int  accountHolderNumber ;
     private  String accountHolderName;
    private   String accountHolderNID;
    private  String accountHolderAddress;
    private  String accountHolderPhone;
    private  String accountHolderPhoto;
    private  double balance;
    private static int accountCounter = 0;
    private  final  int account_starting_range = 11803000;
    private void  account_number_generator(){
        accountCounter++;
        this.accountHolderNumber =   account_starting_range + accountCounter;
    }

  public  Account(String name ,String address ,String phone){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID ="N/A";

      account_number_generator();
        this.balance =12500.0;
    }
    public  Account(String name ,String address ,String phone,String user_NID){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID =user_NID;
        this.accountHolderPhoto ="N/A";
        account_number_generator();
        this.balance =0.0;
    }

    public Account(String name ,String address ,String phone,String photo , String user_NID){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID =user_NID;
        this.accountHolderPhoto =photo;
        account_number_generator();
        this.balance =0.0;
    }


    public String checkAccountHolderDetails(){
        String user_details_message = "Name :" + this.accountHolderName +"\n"+
                "Address :"+ this.accountHolderAddress +"\n"+
                "Phone Number : "+  this.accountHolderPhone +"\n"+
                "NID number : "+ this.accountHolderNID +"\n"+
                "Holder Photo :"+  this.accountHolderPhoto ;

        return   user_details_message ;
    }


    public String  checkAccountNumber(){
        return "Your Account Number is : "+ this.accountHolderNumber;
    }

    public  boolean withdraw(double amount){
        if(amount<=0.0){
            JOptionPane.showMessageDialog(null,"Enter Positive Amount");
            return  false ;
        }
        else if(this.balance-amount<100){
            JOptionPane.showMessageDialog(null,"Balance Limit Cross");
            return  false ;
        }
        else {
            JOptionPane.showMessageDialog(null,"Withdraw Successful!!!!!!");
            this.balance = this.balance - amount ;
            return  true ;
        }

    }

    public boolean deposit(double amount){

        if(amount<=0.0){
            JOptionPane.showMessageDialog(null,"Enter Positive Amount");
            return  false ;
        }
        else  {
            this.balance = this.balance + amount ;
            JOptionPane.showMessageDialog(null,"Deposit Successful!!!!!!");
            return  true ;
        }
    }
}

