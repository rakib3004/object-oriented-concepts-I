package UserSection;


import javax.swing.*;


public class BankingSystem {
    public static void main(String[] args) {

     BankMenu agrani_bank_DU = new BankMenu();
     agrani_bank_DU.account_initialization();
     agrani_bank_DU.account_info_show();

}
}



public class BankMenu {
   private Account array_0f_account[] = new Account[10];
    public void account_initialization(){

        array_0f_account[0] =  new Account("Zidan","ME_IUT","110962","@zidan","Mechanical");
        array_0f_account[1] = new Account("Ainan","MME_BUET","110963","@ainan","Mechatronics");
        array_0f_account[2] = new Account("Azim","SWE_KU","110964","@azim","Soil & Water");
        array_0f_account[3] = new Account("Rakib","IIT_DU","110965","@rakib","Software");
        array_0f_account[4] = new Account("Mahmud","CE_BUET","110966","@mahmud","Civil");
        array_0f_account[5] = new Account("Saiful","YE_BUTEX","110967","@saiful","Yarn");
        array_0f_account[6] = new Account("Alif","CSE_KUET","110968","@alif","Computer Science");
        array_0f_account[7] = new Account("Tahmeed","IIT_DU","110969","@tahmeed","Software");
        array_0f_account[8] = new Account("Niloy","IPE_BUTEX","110970","@niloy","Industrial Production");
        array_0f_account[9] = new Account("Shifat","CSE_KUET","110971","@shifat","Computer Science");



    }

    public  void  account_info_show(){
        int inputAccountNumber ;
        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);


//        JOptionPane.showMessageDialog(null,array_0f_account[0].checkAccountNumber());
//        JOptionPane.showMessageDialog(null,array_0f_account[1].checkAccountNumber());
//        JOptionPane.showMessageDialog(null,array_0f_account[2].checkAccountNumber());
       /* for (int counter =0;counter<3;counter++){

            JOptionPane.showMessageDialog(null,array_0f_account[counter].checkAccountHolderDetails());
        } */

        for(Account temp_acoount : array_0f_account){
            if(temp_acoount!=null){
                if(inputAccountNumber==temp_acoount.checkAccountNumber()) {
                    JOptionPane.showMessageDialog(null, temp_acoount.checkAccountNumber());
                    JOptionPane.showMessageDialog(null, temp_acoount.checkAccountHolderDetails());
                }
                else{
                    continue;
                }

            }

            else
                break;
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


    public int   checkAccountNumber(){
        return  this.accountHolderNumber;
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



