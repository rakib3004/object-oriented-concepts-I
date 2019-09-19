

package UserSection;


import javax.swing.*;



public class BankingSystem {
    public static void main(String[] args) {

     BankMenu agrani_bank_DU = new BankMenu();
     agrani_bank_DU.account_initialization();
     agrani_bank_DU.account_info_show();

     UserMenu pickpoint = new UserMenu();
     pickpoint.Interaction();

}
}

package UserSection;

import javax.swing.*;

public class BankMenu {
   Account array_0f_account[] = new Account[10];
    int parameter=0;
    public void account_initialization(){


        String  name,address,phone,photo,user_NID;

      name =  JOptionPane.showInputDialog("User Name");
        address =  JOptionPane.showInputDialog("User Address");
        phone =  JOptionPane.showInputDialog("User Phone");
        photo =  JOptionPane.showInputDialog("User Photo");
        user_NID =  JOptionPane.showInputDialog("User user_NID");

        array_0f_account[parameter] =  new Account(name,address,phone,photo,user_NID);
        parameter ++;



       /* array_0f_account[0] =  new Account("Zidan","ME_IUT","110962","@zidan","Mechanical");
        array_0f_account[1] = new Account("Ainan","MME_BUET","110963","@ainan","Mechatronics");
        array_0f_account[2] = new Account("Azim","SWE_KU","110964","@azim","Soil & Water");
        array_0f_account[3] = new Account("Rakib","IIT_DU","110965","@rakib","Software");
        array_0f_account[4] = new Account("Mahmud","CE_BUET","110966","@mahmud","Civil");
        array_0f_account[5] = new Account("Saiful","YE_BUTEX","110967","@saiful","Yarn");
        array_0f_account[6] = new Account("Alif","CSE_KUET","110968","@alif","Computer Science");
        array_0f_account[7] = new Account("Tahmeed","IIT_DU","110969","@tahmeed","Software");
        array_0f_account[8] = new Account("Niloy","IPE_BUTEX","110970","@niloy","Industrial Production");
        array_0f_account[9] = new Account("Shifat","CSE_KUET","110971","@shifat","Computer Science");*/


    }

    public  void  account_info_show(){
        int inputAccountNumber ;

        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);


//        JOptionPane.showMessageDialog(null,array_0f_account[0].checkAccountNumber());
//        JOptionPane.showMessageDialog(null,array_0f_account[1].checkAccountNumber());
//
       /* for (int counter =0;counter<3;counter++){

            JOptionPane.showMessageDialog(null,array_0f_account[counter].checkAccountHolderDetails());
        } */
        int amount;
        String input_from_user;

        for(Account temp_acoount : array_0f_account){
            if(temp_acoount!=null){
                if(inputAccountNumber==temp_acoount.checkAccountNumber()) {
                    JOptionPane.showMessageDialog(null,"Your Account Number is :" + temp_acoount.checkAccountNumber());
                    JOptionPane.showMessageDialog(null, temp_acoount.checkAccountHolderDetails());
                     input_from_user = JOptionPane.showInputDialog("Enter Your amount for deposit :");
         amount = Integer.parseInt(input_from_user);
                    temp_acoount.deposit(amount );
                    JOptionPane.showMessageDialog(null,"Your Balance is :"+temp_acoount.checkBalance());
                    input_from_user = JOptionPane.showInputDialog("Enter Your amount to withdraw :");
        amount = Integer.parseInt(input_from_user);
                    temp_acoount.withdraw(amount);
        JOptionPane.showMessageDialog(null,"Your Balance is :"+temp_acoount.checkBalance());

                }
                else{
                    continue;
                }

            }

            else
                break;
        }


    }


    }

package UserSection;


import javax.swing.*;

public class UserMenu {

    public  void  Interaction() {

        BankMenu creat_menu = new BankMenu();
        Account show_info = new Account();

        int key_one;
        int key_two;
        String key_one_string;
        JOptionPane.showMessageDialog(null, "Welcome to Meghna Bank Ltd.");

        String menu1 = "1.Creat Account\n2.Show Infomation\n3.Show Balance\n4.Debit & Credit System\n5.Show Author Information";
        key_one_string = JOptionPane.showInputDialog(null, "What do You Want ????\n" + menu1);
        key_one = Integer.parseInt(key_one_string);

        if(key_one==1){
creat_menu.account_initialization();
        }
        else if(key_one==2){
            creat_menu.account_info_show();
        }
        else if(key_one==3){
            show_info.checkBalance();
        }
        else if(key_one==4){
            key_one_string =   JOptionPane.showInputDialog(null,"What do you want???\n1.withdraw\n2.deposit");
            if(key_one_string=="1"){
                show_info.withdraw();
            }
            else if(key_one_string=="2"){
                show_info.deposit();
            }

        }


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

    public Account(){

    }

  public  Account(String name ,String address ,String phone){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID ="N/A";

      account_number_generator();
        this.balance =5000.0;
    }
    public  Account(String name ,String address ,String phone,String user_NID){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID =user_NID;
        this.accountHolderPhoto ="N/A";
        account_number_generator();
        this.balance =5000.0;
    }

    public Account(String name ,String address ,String phone,String photo , String user_NID){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID =user_NID;
        this.accountHolderPhoto =photo;
        account_number_generator();
        this.balance =5000.0;
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

    public  void withdraw(double amount){
        if(amount<=0.0){
            JOptionPane.showMessageDialog(null,"Enter Positive Amount");

        }
        else if(this.balance-amount<100){
            JOptionPane.showMessageDialog(null,"Balance Limit Cross");
        }
        else {
            this.balance = this.balance - amount ;
            JOptionPane.showMessageDialog(null,"Withdraw Successful!!!!!!");

            JOptionPane.showMessageDialog(null,"Your Balance is :" +this.balance);

        }

    }

    public double checkBalance(){

        return  this.balance;
    }

    public void deposit(double amount){

        if(amount<=0.0){
            JOptionPane.showMessageDialog(null,"Enter Positive Amount");
        }
        else  {
            this.balance = this.balance + amount ;
            JOptionPane.showMessageDialog(null,"Deposit Successful!!!!!!");
            JOptionPane.showMessageDialog(null,"Your Balance is :" +this.balance);


        }
    }
}

